package zendesk.core;

import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.e;
import com.google.gson.l;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.zendesk.logger.Logger;
import com.zendesk.util.StringUtils;

/* loaded from: classes.dex */
class GsonSerializer implements Serializer {
    private static final String LOG_TAG = "GsonSerializer";
    private final l gson;

    public GsonSerializer(l lVar) {
        this.gson = lVar;
    }

    @Override // zendesk.core.Serializer
    public <E> E deserialize(Object obj, Class<E> cls) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (StringUtils.hasLength(str)) {
                try {
                    return (E) this.gson.delta(cls, str);
                } catch (JsonSyntaxException unused) {
                    Logger.d(LOG_TAG, "Unable to deserialize String into object of type %s", cls.getSimpleName());
                }
            }
        } else if (obj instanceof q) {
            q qVar = (q) obj;
            try {
                l lVar = this.gson;
                lVar.getClass();
                TypeToken typeToken = TypeToken.get((Class) cls);
                if (qVar == null) {
                    return null;
                }
                return (E) lVar.bravo(new e(qVar), typeToken);
            } catch (JsonSyntaxException e) {
                Logger.d(LOG_TAG, "Unable to deserialize JsonElement into object of type %s", cls.getSimpleName(), e);
            }
        } else {
            Logger.d(LOG_TAG, "Unable to deserialize the provided object into %s", cls.getSimpleName());
        }
        return null;
    }

    @Override // zendesk.core.Serializer
    public String serialize(Object obj) {
        return this.gson.india(obj);
    }
}
