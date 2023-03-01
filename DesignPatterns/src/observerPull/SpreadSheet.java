package observerPull;

import observerPull.Observer;

public class SpreadSheet implements Observer {

    DataSource dataSourcefeed;

    public SpreadSheet(DataSource dsFeed)
    {
        dataSourcefeed = dsFeed;
    }

    @Override
    public void update() {
        dataSourcefeed.getUpdate();                 // pull style of subscription!
    }
}
