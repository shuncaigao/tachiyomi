package eu.kanade.mangafeed.ui.reader.viewer.common;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

import eu.kanade.mangafeed.data.source.model.Page;

public class ViewPagerReaderAdapter extends FragmentStatePagerAdapter {

    private List<Page> pages;

    public ViewPagerReaderAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return pages == null ? 0 : pages.size();
    }

    @Override
    public Fragment getItem(int position) {
        return ViewPagerReaderFragment.newInstance(pages.get(position));
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
        notifyDataSetChanged();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

}
