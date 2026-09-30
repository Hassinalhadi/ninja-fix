package com.squareup.moshi;

/* loaded from: classes2.dex */
public final class z implements Tf.ap, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public static final Tf.n f11966a;

    /* renamed from: b, reason: collision with root package name */
    public static final Tf.n f11967b;

    /* renamed from: c, reason: collision with root package name */
    public static final Tf.n f11968c;

    /* renamed from: d, reason: collision with root package name */
    public static final Tf.n f11969d;
    public static final Tf.n e;

    /* renamed from: f, reason: collision with root package name */
    public static final Tf.n f11970f;
    public final Tf.m alpha;
    public final Tf.k purple;
    public final Tf.k red;
    public Tf.n silver;
    public int teal;
    public long white = 0;
    public boolean yellow = false;

    static {
        Tf.n nVar = Tf.n.silver;
        f11966a = g8.d.oscar("[]{}\"'/#");
        f11967b = g8.d.oscar("'\\");
        f11968c = g8.d.oscar("\"\\");
        f11969d = g8.d.oscar("\r\n");
        e = g8.d.oscar("*");
        f11970f = Tf.n.silver;
    }

    public z(Tf.m mVar, Tf.k kVar, Tf.n nVar, int i4) {
        this.alpha = mVar;
        this.purple = mVar.delta();
        this.red = kVar;
        this.silver = nVar;
        this.teal = i4;
    }

    public final void charlie(long j5) {
        while (true) {
            long j6 = this.white;
            if (j6 < j5) {
                Tf.n nVar = this.silver;
                Tf.n nVar2 = f11970f;
                if (nVar != nVar2) {
                    Tf.k kVar = this.purple;
                    long j7 = kVar.purple;
                    Tf.m mVar = this.alpha;
                    if (j6 == j7) {
                        if (j6 <= 0) {
                            mVar.kilo(1L);
                        } else {
                            return;
                        }
                    }
                    long quebec = kVar.quebec(this.white, this.silver);
                    if (quebec == -1) {
                        this.white = kVar.purple;
                    } else {
                        byte juliet = kVar.juliet(quebec);
                        Tf.n nVar3 = this.silver;
                        Tf.n nVar4 = f11966a;
                        Tf.n nVar5 = f11968c;
                        Tf.n nVar6 = f11967b;
                        Tf.n nVar7 = e;
                        Tf.n nVar8 = f11969d;
                        if (nVar3 == nVar4) {
                            if (juliet != 34) {
                                if (juliet != 35) {
                                    if (juliet != 39) {
                                        if (juliet != 47) {
                                            if (juliet != 91) {
                                                if (juliet != 93) {
                                                    if (juliet != 123) {
                                                        if (juliet != 125) {
                                                        }
                                                    }
                                                }
                                                int i4 = this.teal - 1;
                                                this.teal = i4;
                                                if (i4 == 0) {
                                                    this.silver = nVar2;
                                                }
                                                this.white = quebec + 1;
                                            }
                                            this.teal++;
                                            this.white = quebec + 1;
                                        } else {
                                            long j10 = quebec + 2;
                                            mVar.kilo(j10);
                                            long j11 = quebec + 1;
                                            byte juliet2 = kVar.juliet(j11);
                                            if (juliet2 == 47) {
                                                this.silver = nVar8;
                                                this.white = j10;
                                            } else if (juliet2 == 42) {
                                                this.silver = nVar7;
                                                this.white = j10;
                                            } else {
                                                this.white = j11;
                                            }
                                        }
                                    } else {
                                        this.silver = nVar6;
                                        this.white = quebec + 1;
                                    }
                                } else {
                                    this.silver = nVar8;
                                    this.white = quebec + 1;
                                }
                            } else {
                                this.silver = nVar5;
                                this.white = quebec + 1;
                            }
                        } else if (nVar3 != nVar6 && nVar3 != nVar5) {
                            if (nVar3 == nVar7) {
                                long j12 = quebec + 2;
                                mVar.kilo(j12);
                                long j13 = quebec + 1;
                                if (kVar.juliet(j13) == 47) {
                                    this.white = j12;
                                    this.silver = nVar4;
                                } else {
                                    this.white = j13;
                                }
                            } else if (nVar3 == nVar8) {
                                this.white = quebec + 1;
                                this.silver = nVar4;
                            } else {
                                throw new AssertionError();
                            }
                        } else if (juliet == 92) {
                            long j14 = quebec + 2;
                            mVar.kilo(j14);
                            this.white = j14;
                        } else {
                            if (this.teal > 0) {
                                nVar2 = nVar4;
                            }
                            this.silver = nVar2;
                            this.white = quebec + 1;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.yellow = true;
    }

    @Override // Tf.ap
    public final long read(Tf.k kVar, long j5) {
        if (!this.yellow) {
            if (j5 == 0) {
                return 0L;
            }
            Tf.k kVar2 = this.red;
            boolean hotel = kVar2.hotel();
            Tf.k kVar3 = this.purple;
            if (!hotel) {
                long read = kVar2.read(kVar, j5);
                long j6 = j5 - read;
                if (!kVar3.hotel()) {
                    long read2 = read(kVar, j6);
                    if (read2 != -1) {
                        return read2 + read;
                    }
                }
                return read;
            }
            charlie(j5);
            long j7 = this.white;
            if (j7 == 0) {
                if (this.silver == f11970f) {
                    return -1L;
                }
                throw new AssertionError();
            }
            long min = Math.min(j5, j7);
            kVar.write(kVar3, min);
            this.white -= min;
            return min;
        }
        throw new IllegalStateException("closed");
    }

    @Override // Tf.ap
    public final Tf.as timeout() {
        return this.alpha.timeout();
    }
}
