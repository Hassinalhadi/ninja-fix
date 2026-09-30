package an;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class g implements MenuItem.OnMenuItemClickListener {
    public static final Class[] charlie = {MenuItem.class};
    public Object alpha;
    public Method bravo;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.bravo;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.alpha;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
