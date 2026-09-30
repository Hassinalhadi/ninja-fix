package t0;

import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2904b extends K3.b {
    public static C2904b white;
    public static C2904b yellow;
    public final /* synthetic */ int silver;
    public BreakIterator teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2904b(int i4) {
        super((byte) 0, 6);
        this.silver = i4;
    }

    public boolean amber(int i4) {
        if (i4 > 0 && azure(i4 - 1)) {
            if (i4 == november().length() || !azure(i4)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean azure(int i4) {
        if (i4 >= 0 && i4 < november().length()) {
            return Character.isLetterOrDigit(november().codePointAt(i4));
        }
        return false;
    }

    @Override // K3.b
    public final int[] foxtrot(int i4) {
        switch (this.silver) {
            case 0:
                int length = november().length();
                if (length <= 0 || i4 >= length) {
                    return null;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                do {
                    BreakIterator breakIterator = this.teal;
                    if (breakIterator != null) {
                        if (!breakIterator.isBoundary(i4)) {
                            BreakIterator breakIterator2 = this.teal;
                            if (breakIterator2 != null) {
                                i4 = breakIterator2.following(i4);
                            } else {
                                Intrinsics.lima("impl");
                                throw null;
                            }
                        } else {
                            BreakIterator breakIterator3 = this.teal;
                            if (breakIterator3 != null) {
                                int following = breakIterator3.following(i4);
                                if (following == -1) {
                                    return null;
                                }
                                return juliet(i4, following);
                            }
                            Intrinsics.lima("impl");
                            throw null;
                        }
                    } else {
                        Intrinsics.lima("impl");
                        throw null;
                    }
                } while (i4 != -1);
                return null;
            default:
                if (november().length() <= 0 || i4 >= november().length()) {
                    return null;
                }
                if (i4 < 0) {
                    i4 = 0;
                }
                while (!azure(i4) && (!azure(i4) || (i4 != 0 && azure(i4 - 1)))) {
                    BreakIterator breakIterator4 = this.teal;
                    if (breakIterator4 != null) {
                        i4 = breakIterator4.following(i4);
                        if (i4 == -1) {
                            return null;
                        }
                    } else {
                        Intrinsics.lima("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator5 = this.teal;
                if (breakIterator5 != null) {
                    int following2 = breakIterator5.following(i4);
                    if (following2 == -1 || !amber(following2)) {
                        return null;
                    }
                    return juliet(i4, following2);
                }
                Intrinsics.lima("impl");
                throw null;
        }
    }

    @Override // K3.b
    public final int[] tango(int i4) {
        switch (this.silver) {
            case 0:
                int length = november().length();
                if (length <= 0 || i4 <= 0) {
                    return null;
                }
                if (i4 > length) {
                    i4 = length;
                }
                do {
                    BreakIterator breakIterator = this.teal;
                    if (breakIterator != null) {
                        if (!breakIterator.isBoundary(i4)) {
                            BreakIterator breakIterator2 = this.teal;
                            if (breakIterator2 != null) {
                                i4 = breakIterator2.preceding(i4);
                            } else {
                                Intrinsics.lima("impl");
                                throw null;
                            }
                        } else {
                            BreakIterator breakIterator3 = this.teal;
                            if (breakIterator3 != null) {
                                int preceding = breakIterator3.preceding(i4);
                                if (preceding == -1) {
                                    return null;
                                }
                                return juliet(preceding, i4);
                            }
                            Intrinsics.lima("impl");
                            throw null;
                        }
                    } else {
                        Intrinsics.lima("impl");
                        throw null;
                    }
                } while (i4 != -1);
                return null;
            default:
                int length2 = november().length();
                if (length2 <= 0 || i4 <= 0) {
                    return null;
                }
                if (i4 > length2) {
                    i4 = length2;
                }
                while (i4 > 0 && !azure(i4 - 1) && !amber(i4)) {
                    BreakIterator breakIterator4 = this.teal;
                    if (breakIterator4 != null) {
                        i4 = breakIterator4.preceding(i4);
                        if (i4 == -1) {
                            return null;
                        }
                    } else {
                        Intrinsics.lima("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator5 = this.teal;
                if (breakIterator5 != null) {
                    int preceding2 = breakIterator5.preceding(i4);
                    if (preceding2 == -1 || !azure(preceding2)) {
                        return null;
                    }
                    if (preceding2 != 0 && azure(preceding2 - 1)) {
                        return null;
                    }
                    return juliet(preceding2, i4);
                }
                Intrinsics.lima("impl");
                throw null;
        }
    }

    public final void zulu(String str) {
        switch (this.silver) {
            case 0:
                this.purple = str;
                BreakIterator breakIterator = this.teal;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    Intrinsics.lima("impl");
                    throw null;
                }
            default:
                this.purple = str;
                BreakIterator breakIterator2 = this.teal;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    Intrinsics.lima("impl");
                    throw null;
                }
        }
    }
}
