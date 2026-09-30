package p3;

import android.location.Location;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements G6.e {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ ab red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ Ref.ObjectRef teal;
    public final /* synthetic */ Function1 white;
    public final /* synthetic */ String yellow;

    public /* synthetic */ l(int i4, ab abVar, String str, Ref.ObjectRef objectRef, Function1 function1, String str2, int i5) {
        this.alpha = i5;
        this.purple = i4;
        this.red = abVar;
        this.silver = str;
        this.teal = objectRef;
        this.white = function1;
        this.yellow = str2;
    }

    @Override // G6.e
    public final void onComplete(Task task) {
        Location location;
        Location location2;
        Location location3;
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(task, "task");
                if (task.juliet()) {
                    location = (Location) task.hotel();
                } else {
                    location = null;
                }
                ab.india(this.red, this.silver, this.teal, this.white, this.yellow, location, false, this.purple);
                return;
            case 1:
                Intrinsics.echo(task, "task");
                if (task.juliet()) {
                    location2 = (Location) task.hotel();
                } else {
                    location2 = null;
                }
                ab.india(this.red, this.silver, this.teal, this.white, this.yellow, location2, false, this.purple);
                return;
            default:
                Intrinsics.echo(task, "fallbackTask");
                if (task.juliet()) {
                    location3 = (Location) task.hotel();
                } else {
                    location3 = null;
                }
                ab.india(this.red, this.silver, this.teal, this.white, this.yellow, location3, false, this.purple);
                return;
        }
    }
}
