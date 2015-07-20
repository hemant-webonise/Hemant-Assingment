package Iterator;
/*Now our base interface and core classes are ready,
 *let’s proceed with the implementation of collection class and iterator.*/
public interface ChannelIterator {
	 
    public boolean hasNext();
     
    public Channel next();
}