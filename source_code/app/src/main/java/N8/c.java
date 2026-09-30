package N8;

import android.util.Log;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c extends Pd.i implements Xd.l {
    public Ref.ObjectRef alpha;
    public Ref.ObjectRef purple;
    public int red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ e teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Nd.c cVar) {
        super(2, cVar);
        this.teal = eVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        c cVar2 = new c(this.teal, cVar);
        cVar2.silver = obj;
        return cVar2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((JSONObject) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x01b7, code lost:
    
        if (r15 == r4) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0191, code lost:
    
        if (r15 == r4) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0168, code lost:
    
        if (r15 == r4) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0142, code lost:
    
        if (r15 == r4) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011a, code lost:
    
        if (r15 == r4) goto L84;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f4  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Boolean bool;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        Unit unit;
        Object charlie;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        e eVar = this.teal;
        G1.f fVar = n.foxtrot;
        switch (i4) {
            case 0:
                ResultKt.alpha(obj);
                JSONObject jSONObject = (JSONObject) this.silver;
                Log.d("SessionConfigFetcher", "Fetched settings: " + jSONObject);
                Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                if (jSONObject.has("app_quality")) {
                    Object obj2 = jSONObject.get("app_quality");
                    Intrinsics.charlie(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    try {
                        if (jSONObject2.has("sessions_enabled")) {
                            bool = (Boolean) jSONObject2.get("sessions_enabled");
                        } else {
                            bool = null;
                        }
                    } catch (JSONException e) {
                        e = e;
                        bool = null;
                    }
                    try {
                        if (jSONObject2.has("sampling_rate")) {
                            objectRef6.alpha = (Double) jSONObject2.get("sampling_rate");
                        }
                        if (jSONObject2.has("session_timeout_seconds")) {
                            objectRef.alpha = (Integer) jSONObject2.get("session_timeout_seconds");
                        }
                        if (jSONObject2.has("cache_duration")) {
                            objectRef7.alpha = (Integer) jSONObject2.get("cache_duration");
                        }
                    } catch (JSONException e4) {
                        e = e4;
                        Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", e);
                        if (bool == null) {
                        }
                    }
                } else {
                    bool = null;
                }
                if (bool == null) {
                    n echo = eVar.echo();
                    this.silver = objectRef6;
                    this.alpha = objectRef;
                    this.purple = objectRef7;
                    this.red = 1;
                    Object charlie2 = echo.charlie(n.charlie, bool, this);
                    if (charlie2 != Od.a.alpha) {
                        charlie2 = Unit.INSTANCE;
                    }
                    if (charlie2 != aVar) {
                        objectRef4 = objectRef6;
                        objectRef5 = objectRef;
                        objectRef3 = objectRef7;
                        objectRef = objectRef5;
                        objectRef2 = objectRef4;
                        if (((Integer) objectRef.alpha) != null) {
                            n echo2 = eVar.echo();
                            Integer num = (Integer) objectRef.alpha;
                            this.silver = objectRef2;
                            this.alpha = objectRef3;
                            this.purple = null;
                            this.red = 2;
                            Object charlie3 = echo2.charlie(n.echo, num, this);
                            if (charlie3 != Od.a.alpha) {
                                charlie3 = Unit.INSTANCE;
                                break;
                            }
                        }
                        if (((Double) objectRef2.alpha) != null) {
                            n echo3 = eVar.echo();
                            Double d4 = (Double) objectRef2.alpha;
                            this.silver = objectRef3;
                            this.alpha = null;
                            this.purple = null;
                            this.red = 3;
                            Object charlie4 = echo3.charlie(n.delta, d4, this);
                            if (charlie4 != Od.a.alpha) {
                                charlie4 = Unit.INSTANCE;
                                break;
                            }
                        }
                        if (((Integer) objectRef3.alpha) != null) {
                            n echo4 = eVar.echo();
                            Integer num2 = (Integer) objectRef3.alpha;
                            this.silver = null;
                            this.alpha = null;
                            this.purple = null;
                            this.red = 4;
                            Object charlie5 = echo4.charlie(fVar, num2, this);
                            if (charlie5 != Od.a.alpha) {
                                charlie5 = Unit.INSTANCE;
                                break;
                            }
                        } else {
                            unit = null;
                            if (unit == null) {
                                n echo5 = eVar.echo();
                                Integer num3 = new Integer(86400);
                                this.silver = null;
                                this.alpha = null;
                                this.purple = null;
                                this.red = 5;
                                Object charlie6 = echo5.charlie(fVar, num3, this);
                                if (charlie6 != Od.a.alpha) {
                                    charlie6 = Unit.INSTANCE;
                                    break;
                                }
                            }
                            n echo6 = eVar.echo();
                            Long l10 = new Long(System.currentTimeMillis());
                            this.silver = null;
                            this.alpha = null;
                            this.purple = null;
                            this.red = 6;
                            charlie = echo6.charlie(n.golf, l10, this);
                            if (charlie != Od.a.alpha) {
                                charlie = Unit.INSTANCE;
                                break;
                            }
                        }
                    }
                    return aVar;
                }
                objectRef2 = objectRef6;
                objectRef3 = objectRef7;
                if (((Integer) objectRef.alpha) != null) {
                }
                if (((Double) objectRef2.alpha) != null) {
                }
                if (((Integer) objectRef3.alpha) != null) {
                }
                break;
            case 1:
                objectRef3 = this.purple;
                objectRef5 = this.alpha;
                objectRef4 = (Ref.ObjectRef) this.silver;
                ResultKt.alpha(obj);
                objectRef = objectRef5;
                objectRef2 = objectRef4;
                if (((Integer) objectRef.alpha) != null) {
                }
                if (((Double) objectRef2.alpha) != null) {
                }
                if (((Integer) objectRef3.alpha) != null) {
                }
                break;
            case 2:
                objectRef3 = this.alpha;
                objectRef2 = (Ref.ObjectRef) this.silver;
                ResultKt.alpha(obj);
                if (((Double) objectRef2.alpha) != null) {
                }
                if (((Integer) objectRef3.alpha) != null) {
                }
                break;
            case 3:
                objectRef3 = (Ref.ObjectRef) this.silver;
                ResultKt.alpha(obj);
                if (((Integer) objectRef3.alpha) != null) {
                }
                break;
            case 4:
                ResultKt.alpha(obj);
                unit = Unit.INSTANCE;
                if (unit == null) {
                }
                n echo62 = eVar.echo();
                Long l102 = new Long(System.currentTimeMillis());
                this.silver = null;
                this.alpha = null;
                this.purple = null;
                this.red = 6;
                charlie = echo62.charlie(n.golf, l102, this);
                if (charlie != Od.a.alpha) {
                }
                break;
            case 5:
                ResultKt.alpha(obj);
                n echo622 = eVar.echo();
                Long l1022 = new Long(System.currentTimeMillis());
                this.silver = null;
                this.alpha = null;
                this.purple = null;
                this.red = 6;
                charlie = echo622.charlie(n.golf, l1022, this);
                if (charlie != Od.a.alpha) {
                }
                break;
            case 6:
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
