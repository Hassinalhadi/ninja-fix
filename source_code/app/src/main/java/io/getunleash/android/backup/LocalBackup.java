package io.getunleash.android.backup;

import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import io.getunleash.android.DefaultUnleashKt;
import io.getunleash.android.data.Parser;
import io.getunleash.android.data.UnleashContext;
import io.getunleash.android.data.UnleashState;
import io.getunleash.android.util.UnleashLogger;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ad;
import yf.InterfaceC3439i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lio/getunleash/android/backup/LocalBackup;", "", "Ljava/io/File;", "localDir", "Lio/getunleash/android/data/UnleashContext;", "lastContext", "<init>", "(Ljava/io/File;Lio/getunleash/android/data/UnleashContext;)V", "context", "", Constants.KEY_ID, "(Lio/getunleash/android/data/UnleashContext;)Ljava/lang/String;", "Lyf/i;", "Lio/getunleash/android/data/UnleashState;", "state", "", "subscribeTo", "(Lyf/i;)V", "writeToDisc", "(Lio/getunleash/android/data/UnleashState;)V", "loadFromDisc", "(Lio/getunleash/android/data/UnleashContext;)Lio/getunleash/android/data/UnleashState;", "Ljava/io/File;", "Lio/getunleash/android/data/UnleashContext;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getunleash/android/backup/BackupState;", "backupAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Companion", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class LocalBackup {

    @NotNull
    public static final String STATE_BACKUP_FILE = "unleash_state.json";

    @NotNull
    private static final String TAG = "LocalBackup";

    @NotNull
    private final JsonAdapter<BackupState> backupAdapter;

    @Nullable
    private UnleashContext lastContext;

    @NotNull
    private final File localDir;

    public LocalBackup(@NotNull File localDir, @Nullable UnleashContext unleashContext) {
        Intrinsics.echo(localDir, "localDir");
        this.localDir = localDir;
        this.lastContext = unleashContext;
        JsonAdapter<BackupState> adapter = Parser.INSTANCE.getMoshi().adapter(BackupState.class);
        Intrinsics.delta(adapter, "adapter(...)");
        this.backupAdapter = adapter;
    }

    private final String id(UnleashContext context) {
        return String.valueOf(context.hashCode());
    }

    @Nullable
    public UnleashState loadFromDisc(@NotNull UnleashContext context) {
        Intrinsics.echo(context, "context");
        File file = new File(this.localDir.getAbsolutePath(), STATE_BACKUP_FILE);
        try {
        } catch (Exception e) {
            UnleashLogger.INSTANCE.w(TAG, "Error loading from disc " + file.getAbsolutePath(), e);
        }
        if (file.exists()) {
            BackupState fromJson = this.backupAdapter.fromJson(FilesKt.juliet(file, a.alpha));
            if (fromJson == null) {
                return null;
            }
            if (!Intrinsics.areEqual(fromJson.getContextId(), id(context))) {
                UnleashLogger.i$default(UnleashLogger.INSTANCE, TAG, "Context id mismatch, ignoring backup for context id " + fromJson.getContextId(), null, 4, null);
                return null;
            }
            return new UnleashState(context, fromJson.getToggles());
        }
        UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "No backup found at " + file.getAbsolutePath(), null, 4, null);
        return null;
    }

    public final void subscribeTo(@NotNull InterfaceC3439i state) {
        Intrinsics.echo(state, "state");
        ad.zulu(DefaultUnleashKt.getUnleashScope(), null, null, new LocalBackup$subscribeTo$1(state, this, null), 3);
    }

    public void writeToDisc(@NotNull UnleashState state) {
        Intrinsics.echo(state, "state");
        try {
            File file = new File(this.localDir.getAbsolutePath(), STATE_BACKUP_FILE);
            String json = this.backupAdapter.toJson(new BackupState(id(state.getContext()), state.getToggles()));
            Intrinsics.delta(json, "toJson(...)");
            byte[] bytes = json.getBytes(a.alpha);
            Intrinsics.delta(bytes, "getBytes(...)");
            FilesKt.mike(file, bytes);
            UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Written state to " + file.getAbsolutePath(), null, 4, null);
        } catch (Exception e) {
            UnleashLogger.INSTANCE.i(TAG, "Error writing to disc", e);
        }
    }

    public /* synthetic */ LocalBackup(File file, UnleashContext unleashContext, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i4 & 2) != 0 ? null : unleashContext);
    }
}
