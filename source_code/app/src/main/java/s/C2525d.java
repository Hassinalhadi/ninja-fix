package s;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m6.AbstractC2105f;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2525d {
    public final C2526e alpha;
    public final C2522a bravo;
    public final C2522a charlie;
    public final View delta;

    public C2525d(C2526e c2526e, C2522a c2522a, C2522a c2522a2, View view) {
        this.alpha = c2526e;
        this.bravo = c2522a;
        this.charlie = c2522a2;
        this.delta = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        if (r7 != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean alpha(Menu menu) {
        int i4;
        int i5;
        List actions;
        int i10;
        CharSequence title;
        Icon icon;
        boolean shouldShowIcon;
        CharSequence label;
        Drawable icon2;
        q.c cVar = (q.c) this.bravo.invoke();
        int i11 = 0;
        if (Intrinsics.areEqual(cVar, null)) {
            return false;
        }
        menu.clear();
        List list = cVar.alpha;
        int size = list.size();
        int i12 = 0;
        int i13 = 1;
        int i14 = 1;
        while (i12 < size) {
            q.b bVar = (q.b) list.get(i12);
            int i15 = 2;
            if (bVar instanceof q.d) {
                i4 = i13 + 1;
                MenuItem add = menu.add(i14, i13, i13, ((q.d) bVar).bravo);
                add.setShowAsAction(2);
                final q.d dVar = (q.d) bVar;
                final int i16 = 0;
                add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: s.c
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        String text;
                        int i17;
                        Intent intent;
                        ActivityOptions pendingIntentBackgroundActivityStartMode;
                        switch (i16) {
                            case 0:
                                ((q.d) dVar).delta.invoke(((C2525d) this).alpha);
                                return true;
                            default:
                                TextClassification textClassification = (TextClassification) this;
                                text = textClassification.getText();
                                if (text != null) {
                                    i17 = text.hashCode();
                                } else {
                                    i17 = 0;
                                }
                                intent = textClassification.getIntent();
                                PendingIntent activity = PendingIntent.getActivity((Context) dVar, i17, intent, 201326592);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    try {
                                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                        return true;
                                    } catch (PendingIntent.CanceledException e) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                        return true;
                                    }
                                }
                                activity.send();
                                return true;
                        }
                    }
                });
            } else {
                if (bVar instanceof q.h) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i4 = i13 + 1;
                        final Context context = this.delta.getContext();
                        q.h hVar = (q.h) bVar;
                        final TextClassification textClassification = hVar.bravo;
                        int i17 = hVar.charlie;
                        if (i17 < 0) {
                            label = textClassification.getLabel();
                            MenuItem add2 = menu.add(R.id.textAssist, R.id.textAssist, i13, label);
                            add2.setShowAsAction(2);
                            icon2 = textClassification.getIcon();
                            add2.setIcon(icon2);
                            final int i18 = 1;
                            add2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: s.c
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) {
                                    String text;
                                    int i172;
                                    Intent intent;
                                    ActivityOptions pendingIntentBackgroundActivityStartMode;
                                    switch (i18) {
                                        case 0:
                                            ((q.d) context).delta.invoke(((C2525d) textClassification).alpha);
                                            return true;
                                        default:
                                            TextClassification textClassification2 = (TextClassification) textClassification;
                                            text = textClassification2.getText();
                                            if (text != null) {
                                                i172 = text.hashCode();
                                            } else {
                                                i172 = 0;
                                            }
                                            intent = textClassification2.getIntent();
                                            PendingIntent activity = PendingIntent.getActivity((Context) context, i172, intent, 201326592);
                                            if (Build.VERSION.SDK_INT >= 34) {
                                                try {
                                                    pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                                    activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                                    return true;
                                                } catch (PendingIntent.CanceledException e) {
                                                    Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                                    return true;
                                                }
                                            }
                                            activity.send();
                                            return true;
                                    }
                                }
                            });
                        } else {
                            if (i17 == 0) {
                                i5 = 1;
                            } else {
                                i5 = i11;
                            }
                            actions = textClassification.getActions();
                            final RemoteAction echo = AbstractC2105f.echo(actions.get(i17));
                            if (i5 != 0) {
                                i10 = 16908353;
                            } else {
                                i10 = i11;
                            }
                            title = echo.getTitle();
                            MenuItem add3 = menu.add(R.id.textAssist, i10, i13, title);
                            if (i5 == 0) {
                                i15 = 0;
                            }
                            add3.setShowAsAction(i15);
                            if (i5 == 0) {
                                shouldShowIcon = echo.shouldShowIcon();
                            }
                            icon = echo.getIcon();
                            add3.setIcon(icon.loadDrawable(context));
                            add3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: s.r
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) {
                                    PendingIntent actionIntent;
                                    ActivityOptions pendingIntentBackgroundActivityStartMode;
                                    actionIntent = echo.getActionIntent();
                                    if (Build.VERSION.SDK_INT >= 34) {
                                        try {
                                            pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                            actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                        } catch (PendingIntent.CanceledException e) {
                                            Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                                        }
                                        return true;
                                    }
                                    actionIntent.send();
                                    return true;
                                }
                            });
                        }
                    }
                } else if (bVar instanceof q.f) {
                    i14++;
                }
                i12++;
                i11 = 0;
            }
            i13 = i4;
            i12++;
            i11 = 0;
        }
        return true;
    }
}
