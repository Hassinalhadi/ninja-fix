package J1;

import I0.af;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
import s6.O5;
import w.o;
import x2.w;

/* loaded from: classes3.dex */
public final class f {
    public static final c papa = new c(1);
    public static final c quebec = new c(2);
    public static final c romeo = new c(3);
    public static final c sierra = new c(4);
    public static final c tango = new c(5);
    public static final c uniform = new c(0);
    public float alpha;
    public float bravo;
    public boolean charlie;
    public final Object delta;
    public final O5 echo;
    public boolean foxtrot;
    public float golf;
    public float hotel;
    public long india;
    public float juliet;
    public final ArrayList kilo;
    public final ArrayList lima;
    public g mike;
    public float november;
    public boolean oscar;

    public f(e eVar) {
        this.alpha = 0.0f;
        this.bravo = Float.MAX_VALUE;
        this.charlie = false;
        this.foxtrot = false;
        this.golf = Float.MAX_VALUE;
        this.hotel = -3.4028235E38f;
        this.india = 0L;
        this.kilo = new ArrayList();
        this.lima = new ArrayList();
        this.delta = null;
        this.echo = new d(eVar);
        this.juliet = 1.0f;
        this.mike = null;
        this.november = Float.MAX_VALUE;
        this.oscar = false;
    }

    public static b bravo() {
        ThreadLocal threadLocal = b.india;
        if (threadLocal.get() == null) {
            threadLocal.set(new b(new J2.c(8)));
        }
        return (b) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [J1.a, java.lang.Object] */
    public final void alpha(float f5) {
        float durationScale;
        if (this.foxtrot) {
            this.november = f5;
            return;
        }
        if (this.mike == null) {
            this.mike = new g(f5);
        }
        g gVar = this.mike;
        double d4 = f5;
        gVar.india = d4;
        double d9 = (float) d4;
        if (d9 <= this.golf) {
            if (d9 >= this.hotel) {
                double abs = Math.abs(this.juliet * 0.75f);
                gVar.delta = abs;
                gVar.echo = abs * 62.5d;
                J2.c cVar = bravo().echo;
                cVar.getClass();
                if (Thread.currentThread() == ((Looper) cVar.red).getThread()) {
                    boolean z2 = this.foxtrot;
                    if (!z2 && !z2) {
                        this.foxtrot = true;
                        if (!this.charlie) {
                            this.bravo = this.echo.golf(this.delta);
                        }
                        float f10 = this.bravo;
                        if (f10 <= this.golf && f10 >= this.hotel) {
                            b bravo = bravo();
                            ArrayList arrayList = bravo.bravo;
                            if (arrayList.size() == 0) {
                                J2.c cVar2 = bravo.echo;
                                cVar2.getClass();
                                ((Choreographer) cVar2.purple).postFrameCallback(new af(bravo.delta, 1));
                                if (Build.VERSION.SDK_INT >= 33) {
                                    durationScale = ValueAnimator.getDurationScale();
                                    bravo.golf = durationScale;
                                    if (bravo.hotel == null) {
                                        bravo.hotel = new o(bravo);
                                    }
                                    final o oVar = bravo.hotel;
                                    if (((a) oVar.purple) == null) {
                                        ?? r12 = new ValueAnimator.DurationScaleChangeListener() { // from class: J1.a
                                            @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                                            public final void onChanged(float f11) {
                                                ((b) o.this.red).golf = f11;
                                            }
                                        };
                                        oVar.purple = r12;
                                        ValueAnimator.registerDurationScaleChangeListener(r12);
                                    }
                                }
                            }
                            if (!arrayList.contains(this)) {
                                arrayList.add(this);
                                return;
                            }
                            return;
                        }
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
    }

    public final void charlie(float f5) {
        ArrayList arrayList;
        this.echo.mike(this.delta, f5);
        int i4 = 0;
        while (true) {
            arrayList = this.lima;
            if (i4 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i4) != null) {
                w wVar = (w) arrayList.get(i4);
                float f10 = this.bravo;
                x2.af afVar = wVar.golf;
                long max = Math.max(-1L, Math.min(afVar.f14092r + 1, Math.round(f10)));
                afVar.bronze(max, wVar.alpha);
                wVar.alpha = max;
            }
            i4++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void delta() {
        if (this.mike.bravo > 0.0d) {
            J2.c cVar = bravo().echo;
            cVar.getClass();
            if (Thread.currentThread() == ((Looper) cVar.red).getThread()) {
                if (this.foxtrot) {
                    this.oscar = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }

    public f(Object obj, O5 o5) {
        this.alpha = 0.0f;
        this.bravo = Float.MAX_VALUE;
        this.charlie = false;
        this.foxtrot = false;
        this.golf = Float.MAX_VALUE;
        this.hotel = -3.4028235E38f;
        this.india = 0L;
        this.kilo = new ArrayList();
        this.lima = new ArrayList();
        this.delta = obj;
        this.echo = o5;
        if (o5 != romeo && o5 != sierra && o5 != tango) {
            if (o5 == uniform) {
                this.juliet = 0.00390625f;
            } else if (o5 != papa && o5 != quebec) {
                this.juliet = 1.0f;
            } else {
                this.juliet = 0.002f;
            }
        } else {
            this.juliet = 0.1f;
        }
        this.mike = null;
        this.november = Float.MAX_VALUE;
        this.oscar = false;
    }
}
