package master.flame.danmaku.controller;

import android.content.Context;

/**
 * For internal control. DO NOT ACCESS this interface.
 */
public interface IDanMuViewController {

    boolean isViewReady();

    int getViewWidth();

    int getViewHeight();

    Context getContext();

    long drawDanMu();

    void clear();

    boolean isHardwareAccelerated();

    boolean isDanMuDrawingCacheEnabled();

}
