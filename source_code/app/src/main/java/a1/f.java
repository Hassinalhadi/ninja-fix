package a1;

import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class f implements d {
    public final o delta;
    public int foxtrot;
    public int golf;
    public o alpha = null;
    public boolean bravo = false;
    public boolean charlie = false;
    public int echo = 1;
    public int hotel = 1;
    public g india = null;
    public boolean juliet = false;
    public final ArrayList kilo = new ArrayList();
    public final ArrayList lima = new ArrayList();

    public f(o oVar) {
        this.delta = oVar;
    }

    @Override // a1.d
    public final void alpha(d dVar) {
        ArrayList arrayList = this.lima;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).juliet) {
                return;
            }
        }
        this.charlie = true;
        o oVar = this.alpha;
        if (oVar != null) {
            oVar.alpha(this);
        }
        if (this.bravo) {
            this.delta.alpha(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i4 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i4++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i4 == 1 && fVar.juliet) {
            g gVar = this.india;
            if (gVar != null) {
                if (gVar.juliet) {
                    this.foxtrot = this.hotel * gVar.golf;
                } else {
                    return;
                }
            }
            delta(fVar.golf + this.foxtrot);
        }
        o oVar2 = this.alpha;
        if (oVar2 != null) {
            oVar2.alpha(this);
        }
    }

    public final void bravo(o oVar) {
        this.kilo.add(oVar);
        if (this.juliet) {
            oVar.alpha(oVar);
        }
    }

    public final void charlie() {
        this.lima.clear();
        this.kilo.clear();
        this.juliet = false;
        this.golf = 0;
        this.charlie = false;
        this.bravo = false;
    }

    public void delta(int i4) {
        if (!this.juliet) {
            this.juliet = true;
            this.golf = i4;
            Iterator it = this.kilo.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.alpha(dVar);
            }
        }
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.delta.bravo.yellow);
        sb2.append(":");
        switch (this.echo) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = BuildConfig.TRAVIS;
                break;
        }
        sb2.append(str);
        sb2.append("(");
        if (this.juliet) {
            obj = Integer.valueOf(this.golf);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.lima.size());
        sb2.append(":d=");
        sb2.append(this.kilo.size());
        sb2.append(">");
        return sb2.toString();
    }
}
