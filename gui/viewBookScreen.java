package gui;
import dao.BooksDAO;
import model.Book;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewBookScreen extends JFrame {
    private final JTable table;
    private final DefaultTableModel model;

    public ViewBookScreen() {
        setTitle("View Books");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        model = new DefaultTableModel(
                new String[] {"ID", "Title", "Author", "Available"}, 0);
        table = new JTable(model);
        loadBooks();
        add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Availability");
        panel.add(btnDelete);
        panel.add(btnUpdate);
        add(panel, BorderLayout.SOUTH);

        btnDelete.addActionListener(e -> deleteSelectedBook());
        btnUpdate.addActionListener(e -> updateSelectedBook());
    }

    private void loadBooks() {
        try {
            BooksDAO dao = new BooksDAO();
            List<Book> books = dao.getAllBooks();
            model.setRowCount(0);
            for (Book book : books) {
                model.addRow(new Object[] {
                        book.getBookID(),
                        book.getBookTitle(),
                        book.getBookAuthor(),
                        book.isAvailable()
                });
            }
        } catch (SQLException exc) {
            JOptionPane.showMessageDialog(this, "Error loading books: " + exc.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteSelectedBook() {
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a book to delete.");
            return;
        }

        int bookID = (int) model.getValueAt(row, 0);
        try {
            new BooksDAO().deleteBook(bookID);
            JOptionPane.showMessageDialog(this, "Book deleted successfully!");
            loadBooks();
        } catch (SQLException exc) {
            JOptionPane.showMessageDialog(this, "Error deleting book: " + exc.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateSelectedBook() {
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a book to update.");
            return;
        }

        int bookID = (int) model.getValueAt(row, 0);
        boolean currentStatus = (boolean) model.getValueAt(row, 3);
        try {
            new BooksDAO().updateBookAvailability(bookID, !currentStatus);
            JOptionPane.showMessageDialog(this, "Book availability updated!");
            loadBooks();
        } catch (SQLException exc) {
            JOptionPane.showMessageDialog(this, "Error updating book: " + exc.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}