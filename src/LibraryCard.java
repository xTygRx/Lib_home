public class LibraryCard <K, V>{

    protected K numberLibraryCard;
    protected V bookInfo;

    public K getNumberLibraryCard() {
        return numberLibraryCard;
    }

    public V getBookInfo() {
        return bookInfo;
    }

    public LibraryCard(K numberLibraryCard, V bookInfo) {
        this.numberLibraryCard = numberLibraryCard;
        this.bookInfo = bookInfo;
    }
}
