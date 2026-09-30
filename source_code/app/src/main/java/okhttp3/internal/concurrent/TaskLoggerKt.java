package okhttp3.internal.concurrent;

import Q0.c;
import com.clevertap.android.sdk.Constants;
import com.zendesk.service.HttpConstants;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0080\bø\u0001\u0000\u001a9\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\bH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001a$\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0002\u001a\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"taskLog", "", "Ljava/util/logging/Logger;", "task", "Lokhttp3/internal/concurrent/Task;", "queue", "Lokhttp3/internal/concurrent/TaskQueue;", "messageBlock", "Lkotlin/Function0;", "", "logElapsed", "T", "block", "(Ljava/util/logging/Logger;Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "log", Constants.KEY_MESSAGE, "formatDuration", "ns", "", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TaskLoggerKt {
    @NotNull
    public static final String formatDuration(long j5) {
        String mike;
        if (j5 <= -999500000) {
            mike = c.mike((j5 - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j5 <= -999500) {
            mike = c.mike((j5 - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j5 <= 0) {
            mike = c.mike((j5 - HttpConstants.HTTP_INTERNAL_ERROR) / 1000, " µs", new StringBuilder());
        } else if (j5 < 999500) {
            mike = c.mike((j5 + HttpConstants.HTTP_INTERNAL_ERROR) / 1000, " µs", new StringBuilder());
        } else if (j5 < 999500000) {
            mike = c.mike((j5 + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            mike = c.mike((j5 + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{mike}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Logger logger, Task task, TaskQueue taskQueue, String str) {
        logger.fine(taskQueue.getName() + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.getName());
    }

    public static final <T> T logElapsed(@NotNull Logger logger, @NotNull Task task, @NotNull TaskQueue queue, @NotNull Function0<? extends T> block) {
        long j5;
        Intrinsics.echo(logger, "<this>");
        Intrinsics.echo(task, "task");
        Intrinsics.echo(queue, "queue");
        Intrinsics.echo(block, "block");
        boolean isLoggable = logger.isLoggable(Level.FINE);
        if (isLoggable) {
            j5 = queue.getTaskRunner().getBackend().nanoTime();
            log(logger, task, queue, "starting");
        } else {
            j5 = -1;
        }
        try {
            T invoke = block.invoke();
            if (isLoggable) {
                log(logger, task, queue, "finished run in " + formatDuration(queue.getTaskRunner().getBackend().nanoTime() - j5));
            }
            return invoke;
        } catch (Throwable th) {
            if (isLoggable) {
                log(logger, task, queue, "failed a run in " + formatDuration(queue.getTaskRunner().getBackend().nanoTime() - j5));
            }
            throw th;
        }
    }

    public static final void taskLog(@NotNull Logger logger, @NotNull Task task, @NotNull TaskQueue queue, @NotNull Function0<String> messageBlock) {
        Intrinsics.echo(logger, "<this>");
        Intrinsics.echo(task, "task");
        Intrinsics.echo(queue, "queue");
        Intrinsics.echo(messageBlock, "messageBlock");
        if (logger.isLoggable(Level.FINE)) {
            log(logger, task, queue, messageBlock.invoke());
        }
    }
}
