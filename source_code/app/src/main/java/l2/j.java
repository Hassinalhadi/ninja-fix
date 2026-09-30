package l2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class j {
    public static String alpha(String tableName, String triggerType) {
        Intrinsics.echo(tableName, "tableName");
        Intrinsics.echo(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }
}
