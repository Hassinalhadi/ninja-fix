package I1;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes3.dex */
public final class a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        boolean z2;
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z10 = false;
        if (windowInsets.getSystemWindowInsetTop() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        drawerLayout.f3100q = windowInsets;
        drawerLayout.f3101r = z2;
        if (!z2 && drawerLayout.getBackground() == null) {
            z10 = true;
        }
        drawerLayout.setWillNotDraw(z10);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
