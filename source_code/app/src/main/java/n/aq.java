package n;

import android.view.KeyEvent;
import k0.AbstractC1994a;
import k0.AbstractC1996c;
import s6.P5;

/* loaded from: classes3.dex */
public final class aq {
    public final /* synthetic */ int alpha;

    public /* synthetic */ aq(int i4) {
        this.alpha = i4;
    }

    public final ap alpha(KeyEvent keyEvent) {
        ap apVar;
        ap apVar2 = null;
        switch (this.alpha) {
            case 0:
                int i4 = ar.purple;
                if (keyEvent.isCtrlPressed() && keyEvent.isShiftPressed()) {
                    if (!AbstractC1994a.alpha(P5.alpha(keyEvent.getKeyCode()), G.golf)) {
                        return null;
                    }
                    return ap.f13017P;
                }
                if (keyEvent.isCtrlPressed()) {
                    long delta = AbstractC1996c.delta(keyEvent);
                    if (!AbstractC1994a.alpha(delta, G.bravo) && !AbstractC1994a.alpha(delta, G.romeo)) {
                        if (AbstractC1994a.alpha(delta, G.delta)) {
                            return ap.f13029m;
                        }
                        if (AbstractC1994a.alpha(delta, G.foxtrot)) {
                            return ap.f13030n;
                        }
                        if (AbstractC1994a.alpha(delta, G.alpha)) {
                            return ap.f13037u;
                        }
                        if (AbstractC1994a.alpha(delta, G.echo)) {
                            return ap.f13017P;
                        }
                        if (!AbstractC1994a.alpha(delta, G.golf)) {
                            return null;
                        }
                        return ap.f13016O;
                    }
                    return ap.f13028l;
                }
                if (keyEvent.isCtrlPressed()) {
                    return null;
                }
                if (keyEvent.isShiftPressed()) {
                    long alpha = P5.alpha(keyEvent.getKeyCode());
                    if (AbstractC1994a.alpha(alpha, G.india)) {
                        return ap.f13038v;
                    }
                    if (AbstractC1994a.alpha(alpha, G.juliet)) {
                        return ap.f13039w;
                    }
                    if (AbstractC1994a.alpha(alpha, G.kilo)) {
                        return ap.f13040x;
                    }
                    if (AbstractC1994a.alpha(alpha, G.lima)) {
                        return ap.f13041y;
                    }
                    if (AbstractC1994a.alpha(alpha, G.november)) {
                        return ap.f13042z;
                    }
                    if (AbstractC1994a.alpha(alpha, G.oscar)) {
                        return ap.A;
                    }
                    if (AbstractC1994a.alpha(alpha, G.papa)) {
                        return ap.f13009H;
                    }
                    if (AbstractC1994a.alpha(alpha, G.quebec)) {
                        return ap.f13010I;
                    }
                    if (!AbstractC1994a.alpha(alpha, G.romeo)) {
                        return null;
                    }
                    return ap.f13029m;
                }
                long alpha2 = P5.alpha(keyEvent.getKeyCode());
                if (AbstractC1994a.alpha(alpha2, G.india)) {
                    return ap.purple;
                }
                if (AbstractC1994a.alpha(alpha2, G.juliet)) {
                    return ap.red;
                }
                if (AbstractC1994a.alpha(alpha2, G.kilo)) {
                    return ap.e;
                }
                if (AbstractC1994a.alpha(alpha2, G.lima)) {
                    return ap.f13022f;
                }
                if (AbstractC1994a.alpha(alpha2, G.mike)) {
                    return ap.f13023g;
                }
                if (AbstractC1994a.alpha(alpha2, G.november)) {
                    return ap.f13024h;
                }
                if (AbstractC1994a.alpha(alpha2, G.oscar)) {
                    return ap.f13025i;
                }
                if (AbstractC1994a.alpha(alpha2, G.papa)) {
                    return ap.f13018a;
                }
                if (AbstractC1994a.alpha(alpha2, G.quebec)) {
                    return ap.f13019b;
                }
                if (!AbstractC1994a.alpha(alpha2, G.sierra) && !AbstractC1994a.alpha(alpha2, G.tango)) {
                    if (AbstractC1994a.alpha(alpha2, G.uniform)) {
                        return ap.f13031o;
                    }
                    if (AbstractC1994a.alpha(alpha2, G.victor)) {
                        return ap.f13032p;
                    }
                    if (AbstractC1994a.alpha(alpha2, G.whiskey)) {
                        return ap.f13029m;
                    }
                    if (AbstractC1994a.alpha(alpha2, G.xray)) {
                        return ap.f13030n;
                    }
                    if (AbstractC1994a.alpha(alpha2, G.yankee)) {
                        return ap.f13028l;
                    }
                    if (!AbstractC1994a.alpha(alpha2, G.zulu)) {
                        return null;
                    }
                    return ap.f13015N;
                }
                return ap.f13014M;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                    long alpha3 = P5.alpha(keyEvent.getKeyCode());
                    if (AbstractC1994a.alpha(alpha3, G.india)) {
                        apVar = ap.f13011J;
                    } else if (AbstractC1994a.alpha(alpha3, G.juliet)) {
                        apVar = ap.f13012K;
                    } else if (AbstractC1994a.alpha(alpha3, G.kilo)) {
                        apVar = ap.B;
                    } else {
                        if (AbstractC1994a.alpha(alpha3, G.lima)) {
                            apVar = ap.C;
                        }
                        apVar = null;
                    }
                } else {
                    if (keyEvent.isAltPressed()) {
                        long alpha4 = P5.alpha(keyEvent.getKeyCode());
                        if (AbstractC1994a.alpha(alpha4, G.india)) {
                            apVar = ap.f13020c;
                        } else if (AbstractC1994a.alpha(alpha4, G.juliet)) {
                            apVar = ap.f13021d;
                        } else if (AbstractC1994a.alpha(alpha4, G.kilo)) {
                            apVar = ap.f13026j;
                        } else if (AbstractC1994a.alpha(alpha4, G.lima)) {
                            apVar = ap.f13027k;
                        }
                    }
                    apVar = null;
                }
                if (apVar == null) {
                    com.google.android.material.internal.s sVar = as.alpha;
                    sVar.getClass();
                    if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                        long alpha5 = P5.alpha(keyEvent.getKeyCode());
                        if (AbstractC1994a.alpha(alpha5, G.india)) {
                            apVar2 = ap.f13005D;
                        } else if (AbstractC1994a.alpha(alpha5, G.juliet)) {
                            apVar2 = ap.f13006E;
                        } else if (AbstractC1994a.alpha(alpha5, G.kilo)) {
                            apVar2 = ap.f13008G;
                        } else if (AbstractC1994a.alpha(alpha5, G.lima)) {
                            apVar2 = ap.f13007F;
                        }
                    } else if (keyEvent.isCtrlPressed()) {
                        long alpha6 = P5.alpha(keyEvent.getKeyCode());
                        if (AbstractC1994a.alpha(alpha6, G.india)) {
                            apVar2 = ap.teal;
                        } else if (AbstractC1994a.alpha(alpha6, G.juliet)) {
                            apVar2 = ap.silver;
                        } else if (AbstractC1994a.alpha(alpha6, G.kilo)) {
                            apVar2 = ap.yellow;
                        } else if (AbstractC1994a.alpha(alpha6, G.lima)) {
                            apVar2 = ap.white;
                        } else if (AbstractC1994a.alpha(alpha6, G.charlie)) {
                            apVar2 = ap.f13031o;
                        } else if (AbstractC1994a.alpha(alpha6, G.victor)) {
                            apVar2 = ap.f13034r;
                        } else if (AbstractC1994a.alpha(alpha6, G.uniform)) {
                            apVar2 = ap.f13033q;
                        } else if (AbstractC1994a.alpha(alpha6, G.hotel)) {
                            apVar2 = ap.f13013L;
                        }
                    } else if (keyEvent.isShiftPressed()) {
                        long alpha7 = P5.alpha(keyEvent.getKeyCode());
                        if (AbstractC1994a.alpha(alpha7, G.papa)) {
                            apVar2 = ap.f13009H;
                        } else if (AbstractC1994a.alpha(alpha7, G.quebec)) {
                            apVar2 = ap.f13010I;
                        }
                    } else if (keyEvent.isAltPressed()) {
                        long alpha8 = P5.alpha(keyEvent.getKeyCode());
                        if (AbstractC1994a.alpha(alpha8, G.uniform)) {
                            apVar2 = ap.f13035s;
                        } else if (AbstractC1994a.alpha(alpha8, G.victor)) {
                            apVar2 = ap.f13036t;
                        }
                    }
                    if (apVar2 == null) {
                        return ((aq) sVar.purple).alpha(keyEvent);
                    }
                    return apVar2;
                }
                return apVar;
        }
    }
}
