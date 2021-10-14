
public class Link
{
    String toponym;
    float x;
    float y;
    String linkInfo;
    
    Link(String toponym_, float x_, float y_, String linkInfo_){
        this.toponym = toponym_;
        this.x = x_;
        this.y = y_;
        this.linkInfo = linkInfo_;
    }

	public void info() {
		System.out.println("Information out");
	}
}

public class Book{
    String name;
    Map<int, Link> linkList = new Map<int, Link>();
    ArrayList<Link> dictionary = new ArrayList<Link>();
    int currentPage;
    int fontSize;
    Map<String, int> contents = new Map<String, int>();
    
    Book(String name_, Map<int, Link> linkList_, ArrayList<Link> dictionary_,int currentPage_, int fontSize_){
        this.name = name_;
        this.linkList = linfList_;
        this.dictionary = dictionary_;
        this.currentPage = currentPage_;
        this.fontSize = fontSize_;
    }
    // Отобразить страницу(int):   void
    public void openPage(int page){
        
        
    }
    // Смена страницы(): void
    public void changePage(){
        
    }
    // Переключение на пункт из содержания(string): void
    public void changeToContent(String var){
        
    }
    // Расставить ссылки(): void
    public void putLinks(){
        
    }
    // Изменить шрифт(int): void
    public void changeFontSize(int size){
        
    }
    // Добавить ссылку в словарь(Ссылка): void
    public void addLink(Link link){
        
    }
    // Сохранение текущей страницы(Ссылка): void
    public void saveCurrentPage(){
        
    }
    
}