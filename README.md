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

![image](https://github.com/user-attachments/assets/75568331-eb03-4b24-9e27-1133118ffb02)
Success when selling a paperback book

---

![image](https://github.com/user-attachments/assets/a1292c63-c727-408d-b121-a648370498a1)
Error when attemp to buy more than the available quantity

---

![image](https://github.com/user-attachments/assets/873c82b9-08ca-4795-ba31-77866ddd0205)
An attempt to buy a book that is not in stock failed after applying the deletion of books that are more than 5 years old.

---

![image](https://github.com/user-attachments/assets/a69d8f5f-57e0-4774-a2d2-898eceab2ceb)
Successful attempt to buy an e-book

---

![image](https://github.com/user-attachments/assets/82ac7814-91a5-4d00-b32c-9b6d94b0ea23)
Error when trying to sell a demo book


