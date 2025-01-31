package cn.jiguang.imui.commons;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import android.util.AttributeSet;

public abstract class Style {

    public Context mContext;
    protected Resources resources;
    protected AttributeSet attrs;

    protected Style(Context context, AttributeSet attrs) {
        this.mContext = context;
        this.attrs = attrs;
        this.resources = context.getResources();
    }

    protected final int getDimension(@DimenRes int dimen) {
        return resources.getDimensionPixelSize(dimen);
    }

    protected final int getColor(@ColorRes int color) {
        return ContextCompat.getColor(mContext, color);
    }

    protected final Drawable getDrawable(@DrawableRes int drawable) {
        return ContextCompat.getDrawable(mContext, drawable);
    }

    protected final Drawable getVectorDrawable(@DrawableRes int drawable) {
        return resources.getDrawable(drawable);
    }

}
