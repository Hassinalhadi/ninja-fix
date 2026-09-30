package okhttp3.internal;

import B2.s;
import Tf.ap;
import Tf.m;
import com.clevertap.android.sdk.Constants;
import fe.C1714f;
import fe.C1715g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.a;
import kotlin.time.b;
import okhttp3.Call;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http2.Header;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.J4;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\t\u001a\u00020\u0000*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0000¢\u0006\u0004\b\u000b\u0010\u000f\u001a\u001b\u0010\u0013\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\"\u001a\u00020!*\b\u0012\u0004\u0012\u00020 0\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\u00020!H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010'\u001a\u00020\u0002*\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0013\u0010+\u001a\u00020**\u00020)H\u0000¢\u0006\u0004\b+\u0010,\u001a#\u0010/\u001a\u00020\u0002*\u00020-2\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0017H\u0000¢\u0006\u0004\b/\u00100\u001a\u0013\u0010/\u001a\u000201*\u00020\u0010H\u0000¢\u0006\u0004\b/\u00102\u001a#\u00104\u001a\u00020\u0002*\u00020-2\u0006\u00103\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0017H\u0000¢\u0006\u0004\b4\u00100\u001a\u0013\u00106\u001a\u00020\u0000*\u000205H\u0000¢\u0006\u0004\b6\u00107\u001a\u001b\u00109\u001a\u00020\u0002*\u0002052\u0006\u00108\u001a\u00020\u0010H\u0000¢\u0006\u0004\b9\u0010:\u001a)\u0010=\u001a\u0002012\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010<\u001a\b\u0012\u0004\u0012\u0002010;H\u0080\bø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a\u0013\u0010@\u001a\u00020\u0015*\u00020?H\u0000¢\u0006\u0004\b@\u0010A\u001a&\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010B*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0080\b¢\u0006\u0004\bC\u0010D\u001a&\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000E\"\u0004\b\u0000\u0010B*\b\u0012\u0004\u0012\u00028\u00000EH\u0080\b¢\u0006\u0004\bC\u0010F\u001a8\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010I\"\u0004\b\u0000\u0010G\"\u0004\b\u0001\u0010H*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010IH\u0080\b¢\u0006\u0004\bC\u0010J\u001a%\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010B*\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0000¢\u0006\u0004\bK\u0010D\u001a/\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010B2\u0012\u0010L\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0001¢\u0006\u0004\bM\u0010N\u001a)\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f\"\u0004\b\u0000\u0010B*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\fH\u0000¢\u0006\u0004\bK\u0010N\u001a\u0013\u0010O\u001a\u000201*\u000205H\u0000¢\u0006\u0004\bO\u0010P\u001a\u0013\u0010O\u001a\u000201*\u00020QH\u0000¢\u0006\u0004\bO\u0010R\u001a\u0013\u0010S\u001a\u00020\u0000*\u00020\u0015H\u0000¢\u0006\u0004\bS\u0010T\u001a\u0013\u0010S\u001a\u00020\u0000*\u00020\u0019H\u0000¢\u0006\u0004\bS\u0010U\u001a5\u0010Z\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010B2\u0006\u0010V\u001a\u00020\r2\f\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000W2\u0006\u0010Y\u001a\u00020\u0000H\u0000¢\u0006\u0004\bZ\u0010[\u001a\u0013\u0010]\u001a\u000201*\u00020\\H\u0000¢\u0006\u0004\b]\u0010^\"\u0014\u0010`\u001a\u00020_8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b`\u0010a\"\u0014\u0010b\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bb\u0010c\"\u0014\u0010d\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bd\u0010e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006f"}, d2 = {"", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "Lokhttp3/HttpUrl;", "includeDefaultPort", "toHostHeader", "(Lokhttp3/HttpUrl;Z)Ljava/lang/String;", "format", "", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "LTf/m;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", "(LTf/m;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "", "checkDuration", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "Lkotlin/time/b;", "checkDuration-HG0u8IE", "(Ljava/lang/String;J)I", "", "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "toHeaders", "(Ljava/util/List;)Lokhttp3/Headers;", "toHeaderList", "(Lokhttp3/Headers;)Ljava/util/List;", "other", "canReuseConnectionFor", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "(Lokhttp3/EventListener;)Lokhttp3/EventListener$Factory;", "LTf/ap;", "timeUnit", "skipAll", "(LTf/ap;ILjava/util/concurrent/TimeUnit;)Z", "", "(LTf/m;)V", "timeout", "discard", "Ljava/net/Socket;", "peerName", "(Ljava/net/Socket;)Ljava/lang/String;", "source", "isHealthy", "(Ljava/net/Socket;LTf/m;)Z", "Lkotlin/Function0;", "block", "threadName", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lokhttp3/Response;", "headersContentLength", "(Lokhttp3/Response;)J", "T", "unmodifiable", "(Ljava/util/List;)Ljava/util/List;", "", "(Ljava/util/Set;)Ljava/util/Set;", "K", "V", "", "(Ljava/util/Map;)Ljava/util/Map;", "toImmutableList", "elements", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "closeQuietly", "(Ljava/net/Socket;)V", "Ljava/net/ServerSocket;", "(Ljava/net/ServerSocket;)V", "toHexString", "(J)Ljava/lang/String;", "(I)Ljava/lang/String;", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "Lokhttp3/Dispatcher;", "assertLockNotHeld", "(Lokhttp3/Dispatcher;)V", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _UtilJvmKt {

    @NotNull
    public static final TimeZone UTC;
    public static final boolean assertionsEnabled;

    @NotNull
    public static final String okHttpName;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        UTC = timeZone;
        assertionsEnabled = false;
        okHttpName = StringsKt.magenta(StringsKt.lime(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    @NotNull
    public static final EventListener.Factory asFactory(@NotNull EventListener eventListener) {
        Intrinsics.echo(eventListener, "<this>");
        return new s(24, eventListener);
    }

    public static final EventListener asFactory$lambda$9(EventListener eventListener, Call it) {
        Intrinsics.echo(it, "it");
        return eventListener;
    }

    public static final void assertLockNotHeld(@NotNull Dispatcher dispatcher) {
        Intrinsics.echo(dispatcher, "<this>");
        if (assertionsEnabled && Thread.holdsLock(dispatcher)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dispatcher);
        }
    }

    public static /* synthetic */ EventListener bravo(EventListener eventListener, Call call) {
        return asFactory$lambda$9(eventListener, call);
    }

    public static final boolean canReuseConnectionFor(@NotNull HttpUrl httpUrl, @NotNull HttpUrl other) {
        Intrinsics.echo(httpUrl, "<this>");
        Intrinsics.echo(other, "other");
        if (Intrinsics.areEqual(httpUrl.host(), other.host()) && httpUrl.port() == other.port() && Intrinsics.areEqual(httpUrl.scheme(), other.scheme())) {
            return true;
        }
        return false;
    }

    public static final int checkDuration(@NotNull String name, long j5, @NotNull TimeUnit unit) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(unit, "unit");
        if (j5 >= 0) {
            long millis = unit.toMillis(j5);
            if (millis <= 2147483647L) {
                if (millis == 0 && j5 > 0) {
                    throw new IllegalArgumentException(name.concat(" too small").toString());
                }
                return (int) millis;
            }
            throw new IllegalArgumentException(name.concat(" too large").toString());
        }
        throw new IllegalStateException(name.concat(" < 0").toString());
    }

    /* renamed from: checkDuration-HG0u8IE */
    public static final int m354checkDurationHG0u8IE(@NotNull String name, long j5) {
        Intrinsics.echo(name, "name");
        int i4 = b.silver;
        if (j5 >= 0) {
            long charlie = b.charlie(j5);
            if (charlie <= 2147483647L) {
                if (charlie == 0 && j5 > 0) {
                    throw new IllegalArgumentException(name.concat(" too small").toString());
                }
                return (int) charlie;
            }
            throw new IllegalArgumentException(name.concat(" too large").toString());
        }
        throw new IllegalStateException(name.concat(" < 0").toString());
    }

    public static final void closeQuietly(@NotNull Socket socket) {
        Intrinsics.echo(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e4) {
            if (!Intrinsics.areEqual(e4.getMessage(), "bio == null")) {
                throw e4;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean discard(@NotNull ap apVar, int i4, @NotNull TimeUnit timeUnit) {
        Intrinsics.echo(apVar, "<this>");
        Intrinsics.echo(timeUnit, "timeUnit");
        try {
            return skipAll(apVar, i4, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @NotNull
    public static final String format(@NotNull String format, @NotNull Object... args) {
        Intrinsics.echo(format, "format");
        Intrinsics.echo(args, "args");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        return String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long headersContentLength(@NotNull Response response) {
        Intrinsics.echo(response, "<this>");
        String str = response.headers().get("Content-Length");
        if (str == null) {
            return -1L;
        }
        return _UtilCommonKt.toLongOrDefault(str, -1L);
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> immutableListOf(@NotNull T... elements) {
        Intrinsics.echo(elements, "elements");
        return toImmutableList(elements);
    }

    public static final boolean isHealthy(@NotNull Socket socket, @NotNull m source) {
        Intrinsics.echo(socket, "<this>");
        Intrinsics.echo(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.hotel();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @NotNull
    public static final String peerName(@NotNull Socket socket) {
        Intrinsics.echo(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (remoteSocketAddress instanceof InetSocketAddress) {
            String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
            Intrinsics.delta(hostName, "getHostName(...)");
            return hostName;
        }
        return remoteSocketAddress.toString();
    }

    @NotNull
    public static final Charset readBomAsCharset(@NotNull m mVar, @NotNull Charset charset) throws IOException {
        Intrinsics.echo(mVar, "<this>");
        Intrinsics.echo(charset, "default");
        int c3 = mVar.c(_UtilCommonKt.getUNICODE_BOMS());
        if (c3 != -1) {
            if (c3 != 0) {
                if (c3 != 1) {
                    if (c3 != 2) {
                        if (c3 != 3) {
                            if (c3 == 4) {
                                Charset charset2 = a.alpha;
                                Charset charset3 = a.foxtrot;
                                if (charset3 == null) {
                                    Charset forName = Charset.forName("UTF-32BE");
                                    Intrinsics.delta(forName, "forName(...)");
                                    a.foxtrot = forName;
                                    return forName;
                                }
                                return charset3;
                            }
                            throw new AssertionError();
                        }
                        return a.charlie;
                    }
                    Charset charset4 = a.alpha;
                    Charset charset5 = a.echo;
                    if (charset5 == null) {
                        Charset forName2 = Charset.forName("UTF-32LE");
                        Intrinsics.delta(forName2, "forName(...)");
                        a.echo = forName2;
                        return forName2;
                    }
                    return charset5;
                }
                return a.bravo;
            }
            return a.alpha;
        }
        return charset;
    }

    @Nullable
    public static final <T> T readFieldOrNull(@NotNull Object instance, @NotNull Class<T> fieldType, @NotNull String fieldName) {
        T t5;
        Object readFieldOrNull;
        Intrinsics.echo(instance, "instance");
        Intrinsics.echo(fieldType, "fieldType");
        Intrinsics.echo(fieldName, "fieldName");
        Class<?> cls = instance.getClass();
        while (true) {
            t5 = null;
            if (!Intrinsics.areEqual(cls, Object.class)) {
                try {
                    Field declaredField = cls.getDeclaredField(fieldName);
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(instance);
                    if (!fieldType.isInstance(obj)) {
                        break;
                    }
                    t5 = fieldType.cast(obj);
                    break;
                } catch (NoSuchFieldException unused) {
                    cls = cls.getSuperclass();
                    Intrinsics.delta(cls, "getSuperclass(...)");
                }
            } else {
                if (Intrinsics.areEqual(fieldName, "delegate") || (readFieldOrNull = readFieldOrNull(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(readFieldOrNull, fieldType, fieldName);
            }
        }
        return t5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [Tf.k, java.lang.Object] */
    public static final boolean skipAll(@NotNull ap apVar, int i4, @NotNull TimeUnit timeUnit) throws IOException {
        Intrinsics.echo(apVar, "<this>");
        Intrinsics.echo(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = apVar.timeout().hasDeadline() ? apVar.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        apVar.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i4)) + nanoTime);
        try {
            ?? obj = new Object();
            while (apVar.read(obj, 8192L) != -1) {
                obj.charlie();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                apVar.timeout().clearDeadline();
                return true;
            }
            apVar.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                apVar.timeout().clearDeadline();
                return false;
            }
            apVar.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                apVar.timeout().clearDeadline();
            } else {
                apVar.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    @NotNull
    public static final ThreadFactory threadFactory(@NotNull final String name, final boolean z2) {
        Intrinsics.echo(name, "name");
        return new ThreadFactory() { // from class: Qf.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadFactory$lambda$1;
                threadFactory$lambda$1 = _UtilJvmKt.threadFactory$lambda$1(name, z2, runnable);
                return threadFactory$lambda$1;
            }
        };
    }

    public static final Thread threadFactory$lambda$1(String str, boolean z2, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z2);
        return thread;
    }

    public static final void threadName(@NotNull String name, @NotNull Function0<Unit> block) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(block, "block");
        Thread currentThread = Thread.currentThread();
        String name2 = currentThread.getName();
        currentThread.setName(name);
        try {
            block.invoke();
        } finally {
            currentThread.setName(name2);
        }
    }

    @NotNull
    public static final List<Header> toHeaderList(@NotNull Headers headers) {
        int collectionSizeOrDefault;
        Intrinsics.echo(headers, "<this>");
        C1715g hotel = J4.hotel(0, headers.size());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(hotel, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = hotel.iterator();
        while (((C1714f) it).red) {
            int alpha = ((x) it).alpha();
            arrayList.add(new Header(headers.name(alpha), headers.value(alpha)));
        }
        return arrayList;
    }

    @NotNull
    public static final Headers toHeaders(@NotNull List<Header> list) {
        Intrinsics.echo(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.getName().romeo(), header.getValue().romeo());
        }
        return builder.build();
    }

    @NotNull
    public static final String toHexString(long j5) {
        String hexString = Long.toHexString(j5);
        Intrinsics.delta(hexString, "toHexString(...)");
        return hexString;
    }

    @NotNull
    public static final String toHostHeader(@NotNull HttpUrl httpUrl, boolean z2) {
        String host;
        Intrinsics.echo(httpUrl, "<this>");
        if (StringsKt.beige(httpUrl.host(), ":", false)) {
            host = Constants.AES_PREFIX + httpUrl.host() + ']';
        } else {
            host = httpUrl.host();
        }
        if (!z2 && httpUrl.port() == HttpUrl.INSTANCE.defaultPort(httpUrl.scheme())) {
            return host;
        }
        return host + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = false;
        }
        return toHostHeader(httpUrl, z2);
    }

    @NotNull
    public static final <T> List<T> toImmutableList(@NotNull List<? extends T> list) {
        Intrinsics.echo(list, "<this>");
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        if (list.size() == 1) {
            List<T> singletonList = Collections.singletonList(list.get(0));
            Intrinsics.delta(singletonList, "singletonList(...)");
            return singletonList;
        }
        Object[] array = list.toArray();
        Intrinsics.delta(array, "toArray(...)");
        List<T> unmodifiableList = Collections.unmodifiableList(ArraysKt.sierra(array));
        Intrinsics.delta(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    @NotNull
    public static final <T> List<T> unmodifiable(@NotNull List<? extends T> list) {
        Intrinsics.echo(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(list);
        Intrinsics.delta(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    @NotNull
    public static final String toHexString(int i4) {
        String hexString = Integer.toHexString(i4);
        Intrinsics.delta(hexString, "toHexString(...)");
        return hexString;
    }

    @NotNull
    public static final <T> Set<T> unmodifiable(@NotNull Set<? extends T> set) {
        Intrinsics.echo(set, "<this>");
        Set<T> unmodifiableSet = Collections.unmodifiableSet(set);
        Intrinsics.delta(unmodifiableSet, "unmodifiableSet(...)");
        return unmodifiableSet;
    }

    @NotNull
    public static final <K, V> Map<K, V> unmodifiable(@NotNull Map<K, ? extends V> map) {
        Intrinsics.echo(map, "<this>");
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.delta(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }

    public static final void closeQuietly(@NotNull ServerSocket serverSocket) {
        Intrinsics.echo(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final <T> List<T> toImmutableList(@Nullable T[] tArr) {
        if (tArr != null && tArr.length != 0) {
            if (tArr.length == 1) {
                List<T> singletonList = Collections.singletonList(tArr[0]);
                Intrinsics.delta(singletonList, "singletonList(...)");
                return singletonList;
            }
            List<T> unmodifiableList = Collections.unmodifiableList(ArraysKt.sierra((Object[]) tArr.clone()));
            Intrinsics.delta(unmodifiableList, "unmodifiableList(...)");
            return unmodifiableList;
        }
        return CollectionsKt.emptyList();
    }

    public static final void skipAll(@NotNull m mVar) throws IOException {
        Intrinsics.echo(mVar, "<this>");
        while (!mVar.hotel()) {
            mVar.india(mVar.delta().purple);
        }
    }
}
