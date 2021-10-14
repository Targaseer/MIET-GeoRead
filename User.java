public class User
{
    ArrayList<Book>bookList = new ArrayList<Book>();
    
    User(ArrayList<Book> bookList)
    {
        this.bookList = bookList;
    }
    User()
    {
        this.bookList = new ArrayList<Book>();
    }
    
    public void findBooks()
    {
        if (bookList.isEmpty())
        {
            System.out.println("Книг не обнаружено");
        }
        else 
        {
            System.out.println("Найдены следующие книги:");
            //for ()
            // пройти по листу и вывести названия книг
        }
    }
    
    public Book openBook(int bookId)
    {
         //for () пройтись по листу, найти айди и вывести книгу
    }
    
    public Book openDictionary(int bookId)
    {
         // for () пройтись по листу, найти айди книги и вывести поле 
         // словарь конкретной книги
    }
    
}
