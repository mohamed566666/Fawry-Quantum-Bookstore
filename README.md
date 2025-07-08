# Fawry-Quantum-Bookstore

**Quantum-Bookstore** is an online bookstore system written in Java, designed to manage an inventory of books of different types such as paper books, e-books, and demo books. The system follows OOP principles and is built to be easily extensible for new product types in the future.

---

## Features

✅ Manage multiple book types:
- **Paper Book** → Has physical stock and can be shipped to a provided address.
- **E-Book** → Digital format, delivered via email.
- **Demo Book** → Showcase-only, not available for sale.

✅ Add a new book to the inventory with details:
- ISBN
- Title
- Author
- Year of publication
- Price

✅ Remove outdated books from inventory:
- Remove books older than a specific number of years.

✅ Buy a book:
- Search for a book by its ISBN.
- Check availability for the requested quantity.
- Reduce stock for paper books.
- Deliver paper books via a shipping service to an address.
- Deliver e-books via a mail service to an email address.
- Generate a receipt for the purchase.

---

## 📦 Project Structure

- `Book` → Abstract base class for all book types.
- `PaperBook` → Represents books with stock and shipping.
- `EBook` → Represents E-books with a file type and email delivery.
- `DemoBook` → Represents demo books not for sale.
- `Inventory` → Manages all operations related to the bookstore inventory.
- `PrintReceiptService` → Handles printing purchase receipts.
- `ShippingService` → Handles shipping for paper books (Not required to be implemented now).
- `MailService` → Handles email delivery for e-books (Not required to be implemented now).
- `QuantumBookstore` → Test class to demonstrate adding, removing, and buying books.

---

