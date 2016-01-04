package eu.kanade.mangafeed.ui.reader.viewer.common;

import android.support.v4.view.PagerAdapter;
import android.view.MotionEvent;
import android.view.ViewGroup;

import rx.functions.Action1;

public interface ViewPagerInterface {

    void setId(int id);
    void setLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setOffscreenPageLimit(int limit);

    int getCurrentItem();
    void setCurrentItem(int item, boolean smoothScroll);

    int getWidth();
    int getHeight();

    PagerAdapter getAdapter();
    void setAdapter(PagerAdapter adapter);

    boolean onImageTouch(MotionEvent motionEvent);

    void setOnChapterBoundariesOutListener(OnChapterBoundariesOutListener listener);
    void setOnChapterSingleTapListener(OnChapterSingleTapListener listener);

    OnChapterBoundariesOutListener getChapterBoundariesListener();
    OnChapterSingleTapListener getChapterSingleTapListener();

    void setOnPageChangeListener(Action1<Integer> onPageChanged);
    void clearOnPageChangeListeners();
}
