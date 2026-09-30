package vg;

import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.FormBody;

/* loaded from: classes2.dex */
public final class ac extends A {
    public final /* synthetic */ int delta;
    public final Method echo;
    public final int foxtrot;
    public final boolean golf;

    public /* synthetic */ ac(Method method, int i4, boolean z2, int i5) {
        this.delta = i5;
        this.echo = method;
        this.foxtrot = i4;
        this.golf = z2;
    }

    @Override // vg.A
    public final void alpha(an anVar, Object obj) {
        switch (this.delta) {
            case 0:
                Map map = (Map) obj;
                Method method = this.echo;
                int i4 = this.foxtrot;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                String obj2 = value.toString();
                                if (obj2 != null) {
                                    FormBody.Builder builder = anVar.juliet;
                                    if (this.golf) {
                                        builder.addEncoded(str, obj2);
                                    } else {
                                        builder.add(str, obj2);
                                    }
                                } else {
                                    throw A.oscar(method, i4, "Field map value '" + value + "' converted to null by " + C3222a.class.getName() + " for key '" + str + "'.", new Object[0]);
                                }
                            } else {
                                throw A.oscar(method, i4, ao.ad.gray("Field map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw A.oscar(method, i4, "Field map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw A.oscar(method, i4, "Field map was null.", new Object[0]);
            case 1:
                Map map2 = (Map) obj;
                Method method2 = this.echo;
                int i5 = this.foxtrot;
                if (map2 != null) {
                    for (Map.Entry entry2 : map2.entrySet()) {
                        String str2 = (String) entry2.getKey();
                        if (str2 != null) {
                            Object value2 = entry2.getValue();
                            if (value2 != null) {
                                anVar.alpha(str2, value2.toString(), this.golf);
                            } else {
                                throw A.oscar(method2, i5, ao.ad.gray("Header map contained null value for key '", str2, "'."), new Object[0]);
                            }
                        } else {
                            throw A.oscar(method2, i5, "Header map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw A.oscar(method2, i5, "Header map was null.", new Object[0]);
            default:
                Map map3 = (Map) obj;
                Method method3 = this.echo;
                int i10 = this.foxtrot;
                if (map3 != null) {
                    for (Map.Entry entry3 : map3.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        if (str3 != null) {
                            Object value3 = entry3.getValue();
                            if (value3 != null) {
                                String obj3 = value3.toString();
                                if (obj3 != null) {
                                    anVar.bravo(str3, obj3, this.golf);
                                } else {
                                    throw A.oscar(method3, i10, "Query map value '" + value3 + "' converted to null by " + C3222a.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                                }
                            } else {
                                throw A.oscar(method3, i10, ao.ad.gray("Query map contained null value for key '", str3, "'."), new Object[0]);
                            }
                        } else {
                            throw A.oscar(method3, i10, "Query map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw A.oscar(method3, i10, "Query map was null", new Object[0]);
        }
    }
}
