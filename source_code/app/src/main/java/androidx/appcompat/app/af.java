package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class af implements View.OnClickListener {
    public final View alpha;
    public final String purple;
    public Method red;
    public Context silver;

    public af(View view, String str) {
        this.alpha = view;
        this.purple = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.red == null) {
            View view2 = this.alpha;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.purple;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.red = method;
                            this.silver = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id2 = view2.getId();
                    if (id2 == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    StringBuilder victor = Q0.c.victor("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    victor.append(view2.getClass());
                    victor.append(str);
                    throw new IllegalStateException(victor.toString());
                }
            }
        }
        try {
            this.red.invoke(this.silver, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException("Could not execute method for android:onClick", e4);
        }
    }
}
