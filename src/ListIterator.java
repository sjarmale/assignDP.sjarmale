//Interface of ListIterator to implement iterator methods corresponding to iterator objects
public interface ListIterator {
    public boolean hasNext();

    public Object Next();

    public void MoveToHead();

    public void Remove();

    public ListIterator createIterator();
}
