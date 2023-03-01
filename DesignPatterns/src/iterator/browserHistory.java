package iterator;

import java.util.ArrayList;
import java.util.List;

public class browserHistory {
    List<String> urls = new ArrayList<String>();

    public void pushHistory(String url){
        urls.add(url);
    }
    public String popHistory(){
        String url = urls.get(urls.size()-1);
        urls.remove(urls.size()-1);
        return url;
    }
    public iterator createBrowserHistoryIterator()
    {
       return new listIterator();
    }
    /*
        listIterator class is implemented only for browser history and is only required here
        therefore nested inside browserHistory class.
    */
    class listIterator implements iterator{

        private int idx;

        listIterator(){
            idx=0;
        }
        @Override
        public void next() {
            idx++;
        }
        @Override
        public String current() {
            return urls.get(idx);
        }
        @Override
        public boolean hasNext() {
            return (idx<urls.size()-1);
        }
    }
}
