package x2;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import delivery.samurai.android.R;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class aw extends z {

    /* renamed from: z, reason: collision with root package name */
    public static final String[] f14065z = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: y, reason: collision with root package name */
    public int f14066y = 3;

    public static void indigo(ai aiVar) {
        int visibility = aiVar.bravo.getVisibility();
        HashMap hashMap = aiVar.alpha;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = aiVar.bravo;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x2.av] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static av ivory(ai aiVar, ai aiVar2) {
        ?? obj = new Object();
        obj.alpha = false;
        obj.bravo = false;
        if (aiVar != null) {
            HashMap hashMap = aiVar.alpha;
            if (hashMap.containsKey("android:visibility:visibility")) {
                obj.charlie = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                obj.echo = (ViewGroup) hashMap.get("android:visibility:parent");
                if (aiVar2 != null) {
                    HashMap hashMap2 = aiVar2.alpha;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        obj.delta = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        obj.foxtrot = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (aiVar == null && aiVar2 != null) {
                            int i4 = obj.charlie;
                            int i5 = obj.delta;
                            if (i4 != i5 || obj.echo != obj.foxtrot) {
                                if (i4 != i5) {
                                    if (i4 == 0) {
                                        obj.bravo = false;
                                        obj.alpha = true;
                                        return obj;
                                    }
                                    if (i5 == 0) {
                                        obj.bravo = true;
                                        obj.alpha = true;
                                        return obj;
                                    }
                                } else {
                                    if (obj.foxtrot == null) {
                                        obj.bravo = false;
                                        obj.alpha = true;
                                        return obj;
                                    }
                                    if (obj.echo == null) {
                                        obj.bravo = true;
                                        obj.alpha = true;
                                        return obj;
                                    }
                                }
                            }
                        } else {
                            if (aiVar != null && obj.delta == 0) {
                                obj.bravo = true;
                                obj.alpha = true;
                                return obj;
                            }
                            if (aiVar2 == null && obj.charlie == 0) {
                                obj.bravo = false;
                                obj.alpha = true;
                            }
                        }
                        return obj;
                    }
                }
                obj.delta = -1;
                obj.foxtrot = null;
                if (aiVar == null) {
                }
                if (aiVar != null) {
                }
                if (aiVar2 == null) {
                    obj.bravo = false;
                    obj.alpha = true;
                }
                return obj;
            }
        }
        obj.charlie = -1;
        obj.echo = null;
        if (aiVar2 != null) {
        }
        obj.delta = -1;
        obj.foxtrot = null;
        if (aiVar == null) {
        }
        if (aiVar != null) {
        }
        if (aiVar2 == null) {
        }
        return obj;
    }

    @Override // x2.z
    public void delta(ai aiVar) {
        indigo(aiVar);
    }

    public abstract ObjectAnimator jade(ViewGroup viewGroup, View view, ai aiVar, ai aiVar2);

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (ivory(oscar(r5, false), sierra(r5, false)).alpha != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01da  */
    @Override // x2.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator kilo(ViewGroup viewGroup, ai aiVar, ai aiVar2) {
        View view;
        boolean z2;
        View view2;
        int i4;
        int i5;
        char c3;
        View view3;
        Animator animator;
        View view4;
        boolean z10;
        boolean z11;
        ViewGroup viewGroup2;
        int i10;
        Bitmap bitmap;
        av ivory = ivory(aiVar, aiVar2);
        if (ivory.alpha && (ivory.echo != null || ivory.foxtrot != null)) {
            int i11 = 0;
            if (ivory.bravo) {
                if ((this.f14066y & 1) == 1 && aiVar2 != null) {
                    View view5 = aiVar2.bravo;
                    if (aiVar == null) {
                        View view6 = (View) view5.getParent();
                    }
                    return jade(viewGroup, view5, aiVar, aiVar2);
                }
            } else {
                int i12 = ivory.delta;
                if ((this.f14066y & 2) == 2 && aiVar != null) {
                    if (aiVar2 != null) {
                        view = aiVar2.bravo;
                    } else {
                        view = null;
                    }
                    View view7 = aiVar.bravo;
                    View view8 = (View) view7.getTag(R.id.save_overlay_view);
                    if (view8 != null) {
                        i4 = i12;
                        i5 = 0;
                        i11 = 1;
                        c3 = 1;
                        view4 = null;
                        animator = null;
                    } else {
                        if (view != null && view.getParent() != null) {
                            if (i12 == 4 || view7 == view) {
                                view2 = view;
                                z2 = false;
                                view = null;
                                if (z2) {
                                }
                                i4 = i12;
                                i5 = 0;
                                c3 = 1;
                                view3 = view2;
                                animator = null;
                                view8 = view;
                                i11 = i5;
                                view4 = view3;
                            }
                        } else if (view != null) {
                            z2 = false;
                            view2 = null;
                            if (z2) {
                                if (view7.getParent() == null) {
                                    i4 = i12;
                                    i5 = 0;
                                    c3 = 1;
                                    view4 = view2;
                                    animator = null;
                                    view8 = view7;
                                } else if (view7.getParent() instanceof View) {
                                    View view9 = (View) view7.getParent();
                                    if (!ivory(sierra(view9, true), oscar(view9, true)).alpha) {
                                        boolean z12 = ah.alpha;
                                        Matrix matrix = new Matrix();
                                        matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                        ar arVar = al.alpha;
                                        arVar.foxtrot(view7, matrix);
                                        arVar.golf(viewGroup, matrix);
                                        animator = null;
                                        RectF rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                        matrix.mapRect(rectF);
                                        int round = Math.round(rectF.left);
                                        int round2 = Math.round(rectF.top);
                                        int round3 = Math.round(rectF.right);
                                        c3 = 1;
                                        int round4 = Math.round(rectF.bottom);
                                        i5 = 0;
                                        ImageView imageView = new ImageView(view7.getContext());
                                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        boolean isAttachedToWindow = view7.isAttachedToWindow();
                                        if (viewGroup != null && viewGroup.isAttachedToWindow()) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (!isAttachedToWindow) {
                                            if (!z10) {
                                                i4 = i12;
                                                view3 = view2;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                                imageView.layout(round, round2, round3, round4);
                                                view8 = imageView;
                                                i11 = i5;
                                                view4 = view3;
                                            } else {
                                                ViewGroup viewGroup3 = (ViewGroup) view7.getParent();
                                                int indexOfChild = viewGroup3.indexOfChild(view7);
                                                viewGroup.getOverlay().add(view7);
                                                z11 = isAttachedToWindow;
                                                i10 = indexOfChild;
                                                viewGroup2 = viewGroup3;
                                            }
                                        } else {
                                            z11 = isAttachedToWindow;
                                            viewGroup2 = null;
                                            i10 = 0;
                                        }
                                        view3 = view2;
                                        int round5 = Math.round(rectF.width());
                                        i4 = i12;
                                        int round6 = Math.round(rectF.height());
                                        if (round5 > 0 && round6 > 0) {
                                            float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                            int round7 = Math.round(round5 * min);
                                            int round8 = Math.round(round6 * min);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(min, min);
                                            if (ah.alpha) {
                                                Picture picture = new Picture();
                                                Canvas beginRecording = picture.beginRecording(round7, round8);
                                                beginRecording.concat(matrix);
                                                view7.draw(beginRecording);
                                                picture.endRecording();
                                                bitmap = ag.alpha(picture);
                                            } else {
                                                bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                                Canvas canvas = new Canvas(bitmap);
                                                canvas.concat(matrix);
                                                view7.draw(canvas);
                                            }
                                        } else {
                                            bitmap = null;
                                        }
                                        if (!z11) {
                                            viewGroup.getOverlay().remove(view7);
                                            viewGroup2.addView(view7, i10);
                                        }
                                        if (bitmap != null) {
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                        imageView.layout(round, round2, round3, round4);
                                        view8 = imageView;
                                        i11 = i5;
                                        view4 = view3;
                                    } else {
                                        i4 = i12;
                                        i5 = 0;
                                        c3 = 1;
                                        view3 = view2;
                                        animator = null;
                                        int id2 = view9.getId();
                                        if (view9.getParent() == null && id2 != -1) {
                                            viewGroup.findViewById(id2);
                                        }
                                        view8 = view;
                                        i11 = i5;
                                        view4 = view3;
                                    }
                                }
                            }
                            i4 = i12;
                            i5 = 0;
                            c3 = 1;
                            view3 = view2;
                            animator = null;
                            view8 = view;
                            i11 = i5;
                            view4 = view3;
                        }
                        z2 = true;
                        view = null;
                        view2 = null;
                        if (z2) {
                        }
                        i4 = i12;
                        i5 = 0;
                        c3 = 1;
                        view3 = view2;
                        animator = null;
                        view8 = view;
                        i11 = i5;
                        view4 = view3;
                    }
                    if (view8 != null) {
                        if (i11 == 0) {
                            int[] iArr = (int[]) aiVar.alpha.get("android:visibility:screenLocation");
                            int i13 = iArr[i5];
                            int i14 = iArr[c3];
                            int[] iArr2 = new int[2];
                            viewGroup.getLocationOnScreen(iArr2);
                            view8.offsetLeftAndRight((i13 - iArr2[i5]) - view8.getLeft());
                            view8.offsetTopAndBottom((i14 - iArr2[c3]) - view8.getTop());
                            viewGroup.getOverlay().add(view8);
                        }
                        ObjectAnimator lavender = lavender(viewGroup, view8, aiVar, aiVar2);
                        if (i11 == 0) {
                            if (lavender == null) {
                                viewGroup.getOverlay().remove(view8);
                                return lavender;
                            }
                            view7.setTag(R.id.save_overlay_view, view8);
                            au auVar = new au(this, viewGroup, view8, view7);
                            lavender.addListener(auVar);
                            lavender.addPauseListener(auVar);
                            papa().alpha(auVar);
                        }
                        return lavender;
                    }
                    if (view4 != null) {
                        int visibility = view4.getVisibility();
                        al.bravo(view4, i5);
                        ObjectAnimator lavender2 = lavender(viewGroup, view4, aiVar, aiVar2);
                        if (lavender2 != null) {
                            at atVar = new at(i4, view4);
                            lavender2.addListener(atVar);
                            papa().alpha(atVar);
                            return lavender2;
                        }
                        al.bravo(view4, visibility);
                        return lavender2;
                    }
                    return animator;
                }
            }
        }
        return null;
    }

    public abstract ObjectAnimator lavender(ViewGroup viewGroup, View view, ai aiVar, ai aiVar2);

    @Override // x2.z
    public final String[] romeo() {
        return f14065z;
    }

    @Override // x2.z
    public final boolean victor(ai aiVar, ai aiVar2) {
        if (aiVar != null || aiVar2 != null) {
            if (aiVar == null || aiVar2 == null || aiVar2.alpha.containsKey("android:visibility:visibility") == aiVar.alpha.containsKey("android:visibility:visibility")) {
                av ivory = ivory(aiVar, aiVar2);
                if (ivory.alpha) {
                    if (ivory.charlie == 0 || ivory.delta == 0) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
