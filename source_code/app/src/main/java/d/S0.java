package d;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.location.Location;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;

/* loaded from: classes3.dex */
public abstract class S0 {
    public static Icon alpha(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static AutofillId bravo(View view) {
        return view.getAutofillId();
    }

    public static float charlie(Location location) {
        return location.getBearingAccuracyDegrees();
    }

    public static float delta(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float echo(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float foxtrot(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float golf(Location location) {
        return location.getSpeedAccuracyMetersPerSecond();
    }

    public static float hotel(Location location) {
        return location.getVerticalAccuracyMeters();
    }

    public static float india(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static boolean juliet(Location location) {
        return location.hasBearingAccuracy();
    }

    public static boolean kilo(Location location) {
        return location.hasSpeedAccuracy();
    }

    public static boolean lima(Location location) {
        return location.hasVerticalAccuracy();
    }

    public static void mike(MenuItem menuItem, char c3, int i4) {
        menuItem.setAlphabeticShortcut(c3, i4);
    }

    public static void november(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void oscar(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void papa(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void quebec(MenuItem menuItem, char c3, int i4) {
        menuItem.setNumericShortcut(c3, i4);
    }

    public static void romeo(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
