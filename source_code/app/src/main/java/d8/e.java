package d8;

import android.util.Base64;
import android.util.JsonWriter;
import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import b8.InterfaceC0735e;
import b8.InterfaceC0736f;
import com.google.firebase.encoders.EncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e implements InterfaceC0734d, InterfaceC0736f {
    public final boolean alpha = true;
    public final JsonWriter bravo;
    public final HashMap charlie;
    public final HashMap delta;
    public final C1592a echo;
    public final boolean foxtrot;

    public e(Writer writer, HashMap hashMap, HashMap hashMap2, C1592a c1592a, boolean z2) {
        this.bravo = new JsonWriter(writer);
        this.charlie = hashMap;
        this.delta = hashMap2;
        this.echo = c1592a;
        this.foxtrot = z2;
    }

    @Override // b8.InterfaceC0734d
    public final InterfaceC0734d alpha(C0732b c0732b, Object obj) {
        india(obj, c0732b.alpha);
        return this;
    }

    @Override // b8.InterfaceC0736f
    public final InterfaceC0736f bravo(String str) {
        juliet();
        this.bravo.value(str);
        return this;
    }

    @Override // b8.InterfaceC0736f
    public final InterfaceC0736f charlie(boolean z2) {
        juliet();
        this.bravo.value(z2);
        return this;
    }

    @Override // b8.InterfaceC0734d
    public final InterfaceC0734d delta(C0732b c0732b, boolean z2) {
        String str = c0732b.alpha;
        juliet();
        JsonWriter jsonWriter = this.bravo;
        jsonWriter.name(str);
        juliet();
        jsonWriter.value(z2);
        return this;
    }

    @Override // b8.InterfaceC0734d
    public final InterfaceC0734d echo(C0732b c0732b, int i4) {
        String str = c0732b.alpha;
        juliet();
        JsonWriter jsonWriter = this.bravo;
        jsonWriter.name(str);
        juliet();
        jsonWriter.value(i4);
        return this;
    }

    @Override // b8.InterfaceC0734d
    public final InterfaceC0734d foxtrot(C0732b c0732b, long j5) {
        String str = c0732b.alpha;
        juliet();
        JsonWriter jsonWriter = this.bravo;
        jsonWriter.name(str);
        juliet();
        jsonWriter.value(j5);
        return this;
    }

    @Override // b8.InterfaceC0734d
    public final InterfaceC0734d golf(C0732b c0732b, double d4) {
        String str = c0732b.alpha;
        juliet();
        JsonWriter jsonWriter = this.bravo;
        jsonWriter.name(str);
        juliet();
        jsonWriter.value(d4);
        return this;
    }

    public final e hotel(Object obj) {
        int i4 = 0;
        JsonWriter jsonWriter = this.bravo;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                juliet();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i4 < length) {
                    jsonWriter.value(r8[i4]);
                    i4++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i4 < length2) {
                    long j5 = jArr[i4];
                    juliet();
                    jsonWriter.value(j5);
                    i4++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i4 < length3) {
                    jsonWriter.value(dArr[i4]);
                    i4++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i4 < length4) {
                    jsonWriter.value(zArr[i4]);
                    i4++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i4 < length5) {
                    hotel(numberArr[i4]);
                    i4++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i4 < length6) {
                    hotel(objArr[i4]);
                    i4++;
                }
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            jsonWriter.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                hotel(it.next());
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    india(entry.getValue(), (String) key);
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            jsonWriter.endObject();
            return this;
        }
        InterfaceC0733c interfaceC0733c = (InterfaceC0733c) this.charlie.get(obj.getClass());
        if (interfaceC0733c != null) {
            jsonWriter.beginObject();
            interfaceC0733c.alpha(obj, this);
            jsonWriter.endObject();
            return this;
        }
        InterfaceC0735e interfaceC0735e = (InterfaceC0735e) this.delta.get(obj.getClass());
        if (interfaceC0735e != null) {
            interfaceC0735e.alpha(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            if (obj instanceof f) {
                int alpha = ((f) obj).alpha();
                juliet();
                jsonWriter.value(alpha);
                return this;
            }
            String name = ((Enum) obj).name();
            juliet();
            jsonWriter.value(name);
            return this;
        }
        jsonWriter.beginObject();
        this.echo.alpha(obj, this);
        throw null;
    }

    public final e india(Object obj, String str) {
        boolean z2 = this.foxtrot;
        JsonWriter jsonWriter = this.bravo;
        if (z2) {
            if (obj == null) {
                return this;
            }
            juliet();
            jsonWriter.name(str);
            hotel(obj);
            return this;
        }
        juliet();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        hotel(obj);
        return this;
    }

    public final void juliet() {
        if (this.alpha) {
        } else {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
