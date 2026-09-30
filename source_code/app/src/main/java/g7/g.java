package g7;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class g extends Drawable.ConstantState {
    public m alpha;
    public ad bravo;
    public V6.a charlie;
    public ColorStateList delta;
    public ColorStateList echo;
    public ColorStateList foxtrot;
    public PorterDuff.Mode golf;
    public Rect hotel;
    public final float india;
    public float juliet;
    public float kilo;
    public int lima;
    public float mike;
    public float november;
    public int oscar;
    public int papa;
    public final Paint.Style quebec;

    public g(m mVar) {
        this.delta = null;
        this.echo = null;
        this.foxtrot = null;
        this.golf = PorterDuff.Mode.SRC_IN;
        this.hotel = null;
        this.india = 1.0f;
        this.juliet = 1.0f;
        this.lima = 255;
        this.mike = 0.0f;
        this.november = 0.0f;
        this.oscar = 0;
        this.papa = 0;
        this.quebec = Paint.Style.FILL_AND_STROKE;
        this.alpha = mVar;
        this.charlie = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        i iVar = new i(this);
        iVar.white = true;
        iVar.yellow = true;
        return iVar;
    }

    public g(g gVar) {
        this.delta = null;
        this.echo = null;
        this.foxtrot = null;
        this.golf = PorterDuff.Mode.SRC_IN;
        this.hotel = null;
        this.india = 1.0f;
        this.juliet = 1.0f;
        this.lima = 255;
        this.mike = 0.0f;
        this.november = 0.0f;
        this.oscar = 0;
        this.papa = 0;
        this.quebec = Paint.Style.FILL_AND_STROKE;
        this.alpha = gVar.alpha;
        this.bravo = gVar.bravo;
        this.charlie = gVar.charlie;
        this.kilo = gVar.kilo;
        this.delta = gVar.delta;
        this.echo = gVar.echo;
        this.golf = gVar.golf;
        this.foxtrot = gVar.foxtrot;
        this.lima = gVar.lima;
        this.india = gVar.india;
        this.papa = gVar.papa;
        this.juliet = gVar.juliet;
        this.mike = gVar.mike;
        this.november = gVar.november;
        this.oscar = gVar.oscar;
        this.quebec = gVar.quebec;
        if (gVar.hotel != null) {
            this.hotel = new Rect(gVar.hotel);
        }
    }
}
