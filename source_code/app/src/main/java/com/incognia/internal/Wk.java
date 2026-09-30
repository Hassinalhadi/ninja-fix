package com.incognia.internal;

import android.content.Context;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.material.datepicker.ah;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes2.dex */
public final class Wk {

    /* renamed from: W, reason: collision with root package name */
    public final CF f9868W;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9869b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f9870f9 = LazyKt.lazy(new Px(this));

    public Wk(Context context, CF cf2) {
        this.f9869b = context;
        this.f9868W = cf2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:73:0x0032, B:11:0x0045, B:15:0x0058, B:19:0x006b, B:23:0x007e, B:27:0x0091, B:31:0x00a4, B:35:0x00b7, B:39:0x00ca, B:43:0x00dd, B:47:0x00f2, B:51:0x0107, B:54:0x011a), top: B:72:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:73:0x0032, B:11:0x0045, B:15:0x0058, B:19:0x006b, B:23:0x007e, B:27:0x0091, B:31:0x00a4, B:35:0x00b7, B:39:0x00ca, B:43:0x00dd, B:47:0x00f2, B:51:0x0107, B:54:0x011a), top: B:72:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:73:0x0032, B:11:0x0045, B:15:0x0058, B:19:0x006b, B:23:0x007e, B:27:0x0091, B:31:0x00a4, B:35:0x00b7, B:39:0x00ca, B:43:0x00dd, B:47:0x00f2, B:51:0x0107, B:54:0x011a), top: B:72:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:73:0x0032, B:11:0x0045, B:15:0x0058, B:19:0x006b, B:23:0x007e, B:27:0x0091, B:31:0x00a4, B:35:0x00b7, B:39:0x00ca, B:43:0x00dd, B:47:0x00f2, B:51:0x0107, B:54:0x011a), top: B:72:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:73:0x0032, B:11:0x0045, B:15:0x0058, B:19:0x006b, B:23:0x007e, B:27:0x0091, B:31:0x00a4, B:35:0x00b7, B:39:0x00ca, B:43:0x00dd, B:47:0x00f2, B:51:0x0107, B:54:0x011a), top: B:72:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:73:0x0032, B:11:0x0045, B:15:0x0058, B:19:0x006b, B:23:0x007e, B:27:0x0091, B:31:0x00a4, B:35:0x00b7, B:39:0x00ca, B:43:0x00dd, B:47:0x00f2, B:51:0x0107, B:54:0x011a), top: B:72:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7 A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:73:0x0032, B:11:0x0045, B:15:0x0058, B:19:0x006b, B:23:0x007e, B:27:0x0091, B:31:0x00a4, B:35:0x00b7, B:39:0x00ca, B:43:0x00dd, B:47:0x00f2, B:51:0x0107, B:54:0x011a), top: B:72:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:73:0x0032, B:11:0x0045, B:15:0x0058, B:19:0x006b, B:23:0x007e, B:27:0x0091, B:31:0x00a4, B:35:0x00b7, B:39:0x00ca, B:43:0x00dd, B:47:0x00f2, B:51:0x0107, B:54:0x011a), top: B:72:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:73:0x0032, B:11:0x0045, B:15:0x0058, B:19:0x006b, B:23:0x007e, B:27:0x0091, B:31:0x00a4, B:35:0x00b7, B:39:0x00ca, B:43:0x00dd, B:47:0x00f2, B:51:0x0107, B:54:0x011a), top: B:72:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2 A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:73:0x0032, B:11:0x0045, B:15:0x0058, B:19:0x006b, B:23:0x007e, B:27:0x0091, B:31:0x00a4, B:35:0x00b7, B:39:0x00ca, B:43:0x00dd, B:47:0x00f2, B:51:0x0107, B:54:0x011a), top: B:72:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107 A[Catch: Exception -> 0x0120, TryCatch #0 {Exception -> 0x0120, blocks: (B:73:0x0032, B:11:0x0045, B:15:0x0058, B:19:0x006b, B:23:0x007e, B:27:0x0091, B:31:0x00a4, B:35:0x00b7, B:39:0x00ca, B:43:0x00dd, B:47:0x00f2, B:51:0x0107, B:54:0x011a), top: B:72:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0017 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RUd b() {
        HealthStats healthStats;
        Map stats;
        HealthStats echo;
        long measurement;
        boolean hasMeasurement;
        Long l10;
        Long l11;
        Long l12;
        Long l13;
        Long l14;
        Long l15;
        Long l16;
        Long l17;
        Long l18;
        Long l19;
        Long l20;
        Long l21;
        long measurement2;
        boolean hasMeasurement2;
        long measurement3;
        boolean hasMeasurement3;
        long measurement4;
        boolean hasMeasurement4;
        long measurement5;
        boolean hasMeasurement5;
        long measurement6;
        boolean hasMeasurement6;
        long measurement7;
        boolean hasMeasurement7;
        long measurement8;
        boolean hasMeasurement8;
        long measurement9;
        boolean hasMeasurement9;
        long measurement10;
        boolean hasMeasurement10;
        long measurement11;
        boolean hasMeasurement11;
        long measurement12;
        boolean hasMeasurement12;
        SystemHealthManager foxtrot;
        try {
            foxtrot = ah.foxtrot(this.f9870f9.getValue());
        } catch (Exception unused) {
        }
        if (foxtrot != null) {
            healthStats = foxtrot.takeMyUidSnapshot();
            if (healthStats != null) {
                try {
                    stats = healthStats.getStats(10014);
                } catch (Exception unused2) {
                }
                if (stats != null) {
                    this.f9868W.getClass();
                    echo = ah.echo(stats.get(CF.f9()));
                    if (echo != null) {
                        try {
                            measurement = echo.getMeasurement(30005);
                            Long valueOf = Long.valueOf(measurement);
                            hasMeasurement = echo.hasMeasurement(30005);
                            if (hasMeasurement) {
                                l10 = valueOf;
                                if (echo != null) {
                                    measurement12 = echo.getMeasurement(30004);
                                    Long valueOf2 = Long.valueOf(measurement12);
                                    hasMeasurement12 = echo.hasMeasurement(30004);
                                    if (hasMeasurement12) {
                                        l11 = valueOf2;
                                        if (echo != null) {
                                            measurement11 = echo.getMeasurement(30006);
                                            Long valueOf3 = Long.valueOf(measurement11);
                                            hasMeasurement11 = echo.hasMeasurement(30006);
                                            if (hasMeasurement11) {
                                                l12 = valueOf3;
                                                if (echo != null) {
                                                    measurement10 = echo.getMeasurement(30003);
                                                    Long valueOf4 = Long.valueOf(measurement10);
                                                    hasMeasurement10 = echo.hasMeasurement(30003);
                                                    if (hasMeasurement10) {
                                                        l13 = valueOf4;
                                                        if (echo != null) {
                                                            measurement9 = echo.getMeasurement(30002);
                                                            Long valueOf5 = Long.valueOf(measurement9);
                                                            hasMeasurement9 = echo.hasMeasurement(30002);
                                                            if (hasMeasurement9) {
                                                                l14 = valueOf5;
                                                                if (echo != null) {
                                                                    measurement8 = echo.getMeasurement(30001);
                                                                    Long valueOf6 = Long.valueOf(measurement8);
                                                                    hasMeasurement8 = echo.hasMeasurement(30001);
                                                                    if (hasMeasurement8) {
                                                                        l15 = valueOf6;
                                                                        if (healthStats != null) {
                                                                            measurement7 = healthStats.getMeasurement(CameraAccessExceptionCompat.CAMERA_UNAVAILABLE_DO_NOT_DISTURB);
                                                                            Long valueOf7 = Long.valueOf(measurement7);
                                                                            hasMeasurement7 = healthStats.hasMeasurement(CameraAccessExceptionCompat.CAMERA_UNAVAILABLE_DO_NOT_DISTURB);
                                                                            if (hasMeasurement7) {
                                                                                l16 = valueOf7;
                                                                                if (healthStats != null) {
                                                                                    measurement6 = healthStats.getMeasurement(10003);
                                                                                    Long valueOf8 = Long.valueOf(measurement6);
                                                                                    hasMeasurement6 = healthStats.hasMeasurement(10003);
                                                                                    if (hasMeasurement6) {
                                                                                        l17 = valueOf8;
                                                                                        if (healthStats != null) {
                                                                                            measurement5 = healthStats.getMeasurement(10063);
                                                                                            Long valueOf9 = Long.valueOf(measurement5);
                                                                                            hasMeasurement5 = healthStats.hasMeasurement(10063);
                                                                                            if (hasMeasurement5) {
                                                                                                l18 = valueOf9;
                                                                                                if (healthStats != null) {
                                                                                                    measurement4 = healthStats.getMeasurement(CameraAccessExceptionCompat.CAMERA_CHARACTERISTICS_CREATION_ERROR);
                                                                                                    Long valueOf10 = Long.valueOf(measurement4);
                                                                                                    hasMeasurement4 = healthStats.hasMeasurement(CameraAccessExceptionCompat.CAMERA_CHARACTERISTICS_CREATION_ERROR);
                                                                                                    if (hasMeasurement4) {
                                                                                                        l19 = valueOf10;
                                                                                                        if (healthStats != null) {
                                                                                                            measurement3 = healthStats.getMeasurement(10004);
                                                                                                            Long valueOf11 = Long.valueOf(measurement3);
                                                                                                            hasMeasurement3 = healthStats.hasMeasurement(10004);
                                                                                                            if (hasMeasurement3) {
                                                                                                                l20 = valueOf11;
                                                                                                                if (healthStats != null) {
                                                                                                                    measurement2 = healthStats.getMeasurement(10062);
                                                                                                                    Long valueOf12 = Long.valueOf(measurement2);
                                                                                                                    hasMeasurement2 = healthStats.hasMeasurement(10062);
                                                                                                                    if (hasMeasurement2) {
                                                                                                                        l21 = valueOf12;
                                                                                                                        return new RUd(l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21);
                                                                                                                    }
                                                                                                                }
                                                                                                                l21 = null;
                                                                                                                return new RUd(l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21);
                                                                                                            }
                                                                                                        }
                                                                                                        l20 = null;
                                                                                                        if (healthStats != null) {
                                                                                                        }
                                                                                                        l21 = null;
                                                                                                        return new RUd(l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21);
                                                                                                    }
                                                                                                }
                                                                                                l19 = null;
                                                                                                if (healthStats != null) {
                                                                                                }
                                                                                                l20 = null;
                                                                                                if (healthStats != null) {
                                                                                                }
                                                                                                l21 = null;
                                                                                                return new RUd(l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21);
                                                                                            }
                                                                                        }
                                                                                        l18 = null;
                                                                                        if (healthStats != null) {
                                                                                        }
                                                                                        l19 = null;
                                                                                        if (healthStats != null) {
                                                                                        }
                                                                                        l20 = null;
                                                                                        if (healthStats != null) {
                                                                                        }
                                                                                        l21 = null;
                                                                                        return new RUd(l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21);
                                                                                    }
                                                                                }
                                                                                l17 = null;
                                                                                if (healthStats != null) {
                                                                                }
                                                                                l18 = null;
                                                                                if (healthStats != null) {
                                                                                }
                                                                                l19 = null;
                                                                                if (healthStats != null) {
                                                                                }
                                                                                l20 = null;
                                                                                if (healthStats != null) {
                                                                                }
                                                                                l21 = null;
                                                                                return new RUd(l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21);
                                                                            }
                                                                        }
                                                                        l16 = null;
                                                                        if (healthStats != null) {
                                                                        }
                                                                        l17 = null;
                                                                        if (healthStats != null) {
                                                                        }
                                                                        l18 = null;
                                                                        if (healthStats != null) {
                                                                        }
                                                                        l19 = null;
                                                                        if (healthStats != null) {
                                                                        }
                                                                        l20 = null;
                                                                        if (healthStats != null) {
                                                                        }
                                                                        l21 = null;
                                                                        return new RUd(l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21);
                                                                    }
                                                                }
                                                                l15 = null;
                                                                if (healthStats != null) {
                                                                }
                                                                l16 = null;
                                                                if (healthStats != null) {
                                                                }
                                                                l17 = null;
                                                                if (healthStats != null) {
                                                                }
                                                                l18 = null;
                                                                if (healthStats != null) {
                                                                }
                                                                l19 = null;
                                                                if (healthStats != null) {
                                                                }
                                                                l20 = null;
                                                                if (healthStats != null) {
                                                                }
                                                                l21 = null;
                                                                return new RUd(l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21);
                                                            }
                                                        }
                                                        l14 = null;
                                                        if (echo != null) {
                                                        }
                                                        l15 = null;
                                                        if (healthStats != null) {
                                                        }
                                                        l16 = null;
                                                        if (healthStats != null) {
                                                        }
                                                        l17 = null;
                                                        if (healthStats != null) {
                                                        }
                                                        l18 = null;
                                                        if (healthStats != null) {
                                                        }
                                                        l19 = null;
                                                        if (healthStats != null) {
                                                        }
                                                        l20 = null;
                                                        if (healthStats != null) {
                                                        }
                                                        l21 = null;
                                                        return new RUd(l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21);
                                                    }
                                                }
                                                l13 = null;
                                                if (echo != null) {
                                                }
                                                l14 = null;
                                                if (echo != null) {
                                                }
                                                l15 = null;
                                                if (healthStats != null) {
                                                }
                                                l16 = null;
                                                if (healthStats != null) {
                                                }
                                                l17 = null;
                                                if (healthStats != null) {
                                                }
                                                l18 = null;
                                                if (healthStats != null) {
                                                }
                                                l19 = null;
                                                if (healthStats != null) {
                                                }
                                                l20 = null;
                                                if (healthStats != null) {
                                                }
                                                l21 = null;
                                                return new RUd(l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21);
                                            }
                                        }
                                        l12 = null;
                                        if (echo != null) {
                                        }
                                        l13 = null;
                                        if (echo != null) {
                                        }
                                        l14 = null;
                                        if (echo != null) {
                                        }
                                        l15 = null;
                                        if (healthStats != null) {
                                        }
                                        l16 = null;
                                        if (healthStats != null) {
                                        }
                                        l17 = null;
                                        if (healthStats != null) {
                                        }
                                        l18 = null;
                                        if (healthStats != null) {
                                        }
                                        l19 = null;
                                        if (healthStats != null) {
                                        }
                                        l20 = null;
                                        if (healthStats != null) {
                                        }
                                        l21 = null;
                                        return new RUd(l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21);
                                    }
                                }
                                l11 = null;
                                if (echo != null) {
                                }
                                l12 = null;
                                if (echo != null) {
                                }
                                l13 = null;
                                if (echo != null) {
                                }
                                l14 = null;
                                if (echo != null) {
                                }
                                l15 = null;
                                if (healthStats != null) {
                                }
                                l16 = null;
                                if (healthStats != null) {
                                }
                                l17 = null;
                                if (healthStats != null) {
                                }
                                l18 = null;
                                if (healthStats != null) {
                                }
                                l19 = null;
                                if (healthStats != null) {
                                }
                                l20 = null;
                                if (healthStats != null) {
                                }
                                l21 = null;
                                return new RUd(l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21);
                            }
                        } catch (Exception unused3) {
                            return null;
                        }
                    }
                    l10 = null;
                    if (echo != null) {
                    }
                    l11 = null;
                    if (echo != null) {
                    }
                    l12 = null;
                    if (echo != null) {
                    }
                    l13 = null;
                    if (echo != null) {
                    }
                    l14 = null;
                    if (echo != null) {
                    }
                    l15 = null;
                    if (healthStats != null) {
                    }
                    l16 = null;
                    if (healthStats != null) {
                    }
                    l17 = null;
                    if (healthStats != null) {
                    }
                    l18 = null;
                    if (healthStats != null) {
                    }
                    l19 = null;
                    if (healthStats != null) {
                    }
                    l20 = null;
                    if (healthStats != null) {
                    }
                    l21 = null;
                    return new RUd(l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21);
                }
            }
            echo = null;
            if (echo != null) {
            }
            l10 = null;
            if (echo != null) {
            }
            l11 = null;
            if (echo != null) {
            }
            l12 = null;
            if (echo != null) {
            }
            l13 = null;
            if (echo != null) {
            }
            l14 = null;
            if (echo != null) {
            }
            l15 = null;
            if (healthStats != null) {
            }
            l16 = null;
            if (healthStats != null) {
            }
            l17 = null;
            if (healthStats != null) {
            }
            l18 = null;
            if (healthStats != null) {
            }
            l19 = null;
            if (healthStats != null) {
            }
            l20 = null;
            if (healthStats != null) {
            }
            l21 = null;
            return new RUd(l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21);
        }
        healthStats = null;
        if (healthStats != null) {
        }
        echo = null;
        if (echo != null) {
        }
        l10 = null;
        if (echo != null) {
        }
        l11 = null;
        if (echo != null) {
        }
        l12 = null;
        if (echo != null) {
        }
        l13 = null;
        if (echo != null) {
        }
        l14 = null;
        if (echo != null) {
        }
        l15 = null;
        if (healthStats != null) {
        }
        l16 = null;
        if (healthStats != null) {
        }
        l17 = null;
        if (healthStats != null) {
        }
        l18 = null;
        if (healthStats != null) {
        }
        l19 = null;
        if (healthStats != null) {
        }
        l20 = null;
        if (healthStats != null) {
        }
        l21 = null;
        return new RUd(l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21);
    }
}
