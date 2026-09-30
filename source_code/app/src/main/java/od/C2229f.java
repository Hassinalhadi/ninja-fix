package od;

import Af.t;

/* renamed from: od.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2229f extends Dd.e {
    public static final t golf = new t("Before", 1);
    public static final t hotel = new t("State", 1);
    public static final t india = new t("Transform", 1);
    public static final t juliet = new t("Render", 1);
    public static final t kilo = new t("Send", 1);
    public static final t lima = new t("Before", 1);
    public static final t mike = new t("State", 1);
    public static final t november = new t("Monitoring", 1);
    public static final t oscar = new t("Engine", 1);
    public static final t papa = new t("Receive", 1);
    public final /* synthetic */ int echo;
    public final boolean foxtrot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2229f(int i4) {
        super(golf, hotel, india, juliet, kilo);
        this.echo = i4;
        switch (i4) {
            case 1:
                super(lima, mike, november, oscar, papa);
                this.foxtrot = true;
                return;
            default:
                this.foxtrot = true;
                return;
        }
    }

    @Override // Dd.e
    public final boolean delta() {
        switch (this.echo) {
            case 0:
                return this.foxtrot;
            default:
                return this.foxtrot;
        }
    }
}
