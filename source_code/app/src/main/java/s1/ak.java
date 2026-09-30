package s1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class ak implements View.OnApplyWindowInsetsListener {
    public a0 alpha = null;
    public final /* synthetic */ View bravo;
    public final /* synthetic */ InterfaceC2587u charlie;

    public ak(View view, InterfaceC2587u interfaceC2587u) {
        this.bravo = view;
        this.charlie = interfaceC2587u;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        a0 hotel = a0.hotel(view, windowInsets);
        int i4 = Build.VERSION.SDK_INT;
        InterfaceC2587u interfaceC2587u = this.charlie;
        if (i4 < 30) {
            al.alpha(windowInsets, this.bravo);
            if (hotel.equals(this.alpha)) {
                return interfaceC2587u.gold(view, hotel).golf();
            }
        }
        this.alpha = hotel;
        a0 gold = interfaceC2587u.gold(view, hotel);
        if (i4 >= 30) {
            return gold.golf();
        }
        WeakHashMap weakHashMap = au.alpha;
        aj.charlie(view);
        return gold.golf();
    }
}
