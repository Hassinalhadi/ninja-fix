package ja.burhanrashid52.photoeditor;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lja/burhanrashid52/photoeditor/CustomEffect;", "", "builder", "Lja/burhanrashid52/photoeditor/CustomEffect$Builder;", "(Lja/burhanrashid52/photoeditor/CustomEffect$Builder;)V", "effectName", "", "getEffectName", "()Ljava/lang/String;", "parameters", "", "getParameters", "()Ljava/util/Map;", "Builder", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomEffect {

    @NotNull
    private final String effectName;

    @NotNull
    private final Map<String, Object> parameters;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lja/burhanrashid52/photoeditor/CustomEffect$Builder;", "", "effectName", "", "(Ljava/lang/String;)V", "mEffectName", "getMEffectName", "()Ljava/lang/String;", "parametersMap", "", "getParametersMap", "()Ljava/util/Map;", "build", "Lja/burhanrashid52/photoeditor/CustomEffect;", "setParameter", "paramKey", "paramValue", "photoeditor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder {

        @NotNull
        private final String mEffectName;

        @NotNull
        private final Map<String, Object> parametersMap;

        public Builder(@NotNull String effectName) {
            Intrinsics.echo(effectName, "effectName");
            this.parametersMap = new HashMap();
            if (!TextUtils.isEmpty(effectName)) {
                this.mEffectName = effectName;
                return;
            }
            throw new RuntimeException("Effect name cannot be empty.Please provide effect name from EffectFactory");
        }

        @NotNull
        public final CustomEffect build() {
            return new CustomEffect(this, null);
        }

        @NotNull
        public final String getMEffectName() {
            return this.mEffectName;
        }

        @NotNull
        public final Map<String, Object> getParametersMap() {
            return this.parametersMap;
        }

        @NotNull
        public final Builder setParameter(@NotNull String paramKey, @NotNull Object paramValue) {
            Intrinsics.echo(paramKey, "paramKey");
            Intrinsics.echo(paramValue, "paramValue");
            this.parametersMap.put(paramKey, paramValue);
            return this;
        }
    }

    public /* synthetic */ CustomEffect(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @NotNull
    public final String getEffectName() {
        return this.effectName;
    }

    @NotNull
    public final Map<String, Object> getParameters() {
        return this.parameters;
    }

    private CustomEffect(Builder builder) {
        this.effectName = builder.getMEffectName();
        this.parameters = builder.getParametersMap();
    }
}
