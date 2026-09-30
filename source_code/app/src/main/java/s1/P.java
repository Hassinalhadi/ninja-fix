package s1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j1.C1929c;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes3.dex */
public class P extends X {
    public static boolean india;
    public static Method juliet;
    public static Class kilo;
    public static Field lima;
    public static Field mike;
    public final WindowInsets charlie;
    public C1929c[] delta;
    public C1929c echo;
    public a0 foxtrot;
    public C1929c golf;
    public int hotel;

    public P(a0 a0Var, WindowInsets windowInsets) {
        super(a0Var);
        this.echo = null;
        this.charlie = windowInsets;
    }

    @SuppressLint({"PrivateApi"})
    private static void azure() {
        try {
            juliet = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            kilo = cls;
            lima = cls.getDeclaredField("mVisibleInsets");
            mike = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            lima.setAccessible(true);
            mike.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        india = true;
    }

    public static boolean beige(int i4, int i5) {
        if ((i4 & 6) == (i5 & 6)) {
            return true;
        }
        return false;
    }

    @SuppressLint({"WrongConstant"})
    private C1929c whiskey(int i4, boolean z2) {
        C1929c c1929c = C1929c.echo;
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i4 & i5) != 0) {
                c1929c = C1929c.alpha(c1929c, xray(i5, z2));
            }
        }
        return c1929c;
    }

    private C1929c yankee() {
        a0 a0Var = this.foxtrot;
        if (a0Var != null) {
            return a0Var.alpha.juliet();
        }
        return C1929c.echo;
    }

    private C1929c zulu(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!india) {
                azure();
            }
            Method method = juliet;
            if (method != null && kilo != null && lima != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) lima.get(mike.get(invoke));
                    if (rect != null) {
                        return C1929c.bravo(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    public boolean amber(int i4) {
        if (i4 != 1 && i4 != 2) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 8 && i4 != 128) {
                return true;
            }
        }
        return !xray(i4, false).equals(C1929c.echo);
    }

    @Override // s1.X
    public void delta(View view) {
        C1929c zulu = zulu(view);
        if (zulu == null) {
            zulu = C1929c.echo;
        }
        sierra(zulu);
    }

    @Override // s1.X
    public void echo(a0 a0Var) {
        a0Var.alpha.tango(this.foxtrot);
        C1929c c1929c = this.golf;
        X x4 = a0Var.alpha;
        x4.sierra(c1929c);
        x4.victor(this.hotel);
    }

    @Override // s1.X
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        P p4 = (P) obj;
        if (!Objects.equals(this.golf, p4.golf) || !beige(this.hotel, p4.hotel)) {
            return false;
        }
        return true;
    }

    @Override // s1.X
    public C1929c golf(int i4) {
        return whiskey(i4, false);
    }

    @Override // s1.X
    public C1929c hotel(int i4) {
        return whiskey(i4, true);
    }

    @Override // s1.X
    public final C1929c lima() {
        if (this.echo == null) {
            WindowInsets windowInsets = this.charlie;
            this.echo = C1929c.bravo(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.echo;
    }

    @Override // s1.X
    public a0 november(int i4, int i5, int i10, int i11) {
        O j5;
        a0 hotel = a0.hotel(null, this.charlie);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            j5 = new N(hotel);
        } else if (i12 >= 31) {
            j5 = new M(hotel);
        } else if (i12 >= 30) {
            j5 = new L(hotel);
        } else if (i12 >= 29) {
            j5 = new K(hotel);
        } else {
            j5 = new J(hotel);
        }
        j5.golf(a0.echo(lima(), i4, i5, i10, i11));
        j5.echo(a0.echo(juliet(), i4, i5, i10, i11));
        return j5.bravo();
    }

    @Override // s1.X
    public boolean papa() {
        return this.charlie.isRound();
    }

    @Override // s1.X
    @SuppressLint({"WrongConstant"})
    public boolean quebec(int i4) {
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i4 & i5) != 0 && !amber(i5)) {
                return false;
            }
        }
        return true;
    }

    @Override // s1.X
    public void romeo(C1929c[] c1929cArr) {
        this.delta = c1929cArr;
    }

    @Override // s1.X
    public void sierra(C1929c c1929c) {
        this.golf = c1929c;
    }

    @Override // s1.X
    public void tango(a0 a0Var) {
        this.foxtrot = a0Var;
    }

    @Override // s1.X
    public void victor(int i4) {
        this.hotel = i4;
    }

    public C1929c xray(int i4, boolean z2) {
        int i5;
        C2575h foxtrot;
        int i10;
        int i11;
        int i12;
        C1929c c1929c = C1929c.echo;
        int i13 = 0;
        if (i4 != 1) {
            C1929c c1929c2 = null;
            if (i4 != 2) {
                if (i4 != 8) {
                    if (i4 != 16) {
                        if (i4 != 32) {
                            if (i4 != 64) {
                                if (i4 == 128) {
                                    a0 a0Var = this.foxtrot;
                                    if (a0Var != null) {
                                        foxtrot = a0Var.alpha.foxtrot();
                                    } else {
                                        foxtrot = foxtrot();
                                    }
                                    if (foxtrot != null) {
                                        int i14 = Build.VERSION.SDK_INT;
                                        if (i14 >= 28) {
                                            i10 = E2.e.juliet(foxtrot.alpha);
                                        } else {
                                            i10 = 0;
                                        }
                                        if (i14 >= 28) {
                                            i11 = E2.e.lima(foxtrot.alpha);
                                        } else {
                                            i11 = 0;
                                        }
                                        if (i14 >= 28) {
                                            i12 = E2.e.kilo(foxtrot.alpha);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i14 >= 28) {
                                            i13 = E2.e.india(foxtrot.alpha);
                                        }
                                        return C1929c.bravo(i10, i11, i12, i13);
                                    }
                                }
                            } else {
                                return mike();
                            }
                        } else {
                            return india();
                        }
                    } else {
                        return kilo();
                    }
                } else {
                    C1929c[] c1929cArr = this.delta;
                    if (c1929cArr != null) {
                        c1929c2 = c1929cArr[t6.aa.alpha(8)];
                    }
                    if (c1929c2 != null) {
                        return c1929c2;
                    }
                    C1929c lima2 = lima();
                    C1929c yankee = yankee();
                    int i15 = lima2.delta;
                    if (i15 > yankee.delta) {
                        return C1929c.bravo(0, 0, 0, i15);
                    }
                    C1929c c1929c3 = this.golf;
                    if (c1929c3 != null && !c1929c3.equals(c1929c) && (i5 = this.golf.delta) > yankee.delta) {
                        return C1929c.bravo(0, 0, 0, i5);
                    }
                }
            } else {
                if (z2) {
                    C1929c yankee2 = yankee();
                    C1929c juliet2 = juliet();
                    return C1929c.bravo(Math.max(yankee2.alpha, juliet2.alpha), 0, Math.max(yankee2.charlie, juliet2.charlie), Math.max(yankee2.delta, juliet2.delta));
                }
                if ((this.hotel & 2) == 0) {
                    C1929c lima3 = lima();
                    a0 a0Var2 = this.foxtrot;
                    if (a0Var2 != null) {
                        c1929c2 = a0Var2.alpha.juliet();
                    }
                    int i16 = lima3.delta;
                    if (c1929c2 != null) {
                        i16 = Math.min(i16, c1929c2.delta);
                    }
                    return C1929c.bravo(lima3.alpha, 0, lima3.charlie, i16);
                }
            }
        } else {
            if (z2) {
                return C1929c.bravo(0, Math.max(yankee().bravo, lima().bravo), 0, 0);
            }
            if ((this.hotel & 4) == 0) {
                return C1929c.bravo(0, lima().bravo, 0, 0);
            }
        }
        return c1929c;
    }

    public P(a0 a0Var, P p4) {
        this(a0Var, new WindowInsets(p4.charlie));
    }
}
