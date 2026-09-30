package J1;

/* loaded from: classes3.dex */
public final class g {
    public double alpha;
    public double bravo;
    public boolean charlie;
    public double delta;
    public double echo;
    public double foxtrot;
    public double golf;
    public double hotel;
    public double india;
    public final G.a juliet;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, G.a] */
    public g() {
        this.alpha = Math.sqrt(1500.0d);
        this.bravo = 0.5d;
        this.charlie = false;
        this.india = Double.MAX_VALUE;
        this.juliet = new Object();
    }

    public final void alpha(float f5) {
        if (f5 >= 0.0f) {
            this.bravo = f5;
            this.charlie = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void bravo(float f5) {
        if (f5 > 0.0f) {
            this.alpha = Math.sqrt(f5);
            this.charlie = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final G.a charlie(long j5, double d4, double d9) {
        double sin;
        double cos;
        if (!this.charlie) {
            if (this.india != Double.MAX_VALUE) {
                double d10 = this.bravo;
                if (d10 > 1.0d) {
                    double d11 = this.alpha;
                    this.foxtrot = (Math.sqrt((d10 * d10) - 1.0d) * d11) + ((-d10) * d11);
                    double d12 = this.bravo;
                    double d13 = this.alpha;
                    this.golf = ((-d12) * d13) - (Math.sqrt((d12 * d12) - 1.0d) * d13);
                } else if (d10 >= 0.0d && d10 < 1.0d) {
                    this.hotel = Math.sqrt(1.0d - (d10 * d10)) * this.alpha;
                }
                this.charlie = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d14 = j5 / 1000.0d;
        double d15 = d4 - this.india;
        double d16 = this.bravo;
        if (d16 > 1.0d) {
            double d17 = this.golf;
            double d18 = ((d17 * d15) - d9) / (d17 - this.foxtrot);
            double d19 = d15 - d18;
            sin = (Math.pow(2.718281828459045d, this.foxtrot * d14) * d18) + (Math.pow(2.718281828459045d, d17 * d14) * d19);
            double d20 = this.golf;
            double pow = Math.pow(2.718281828459045d, d20 * d14) * d19 * d20;
            double d21 = this.foxtrot;
            cos = (Math.pow(2.718281828459045d, d21 * d14) * d18 * d21) + pow;
        } else if (d16 == 1.0d) {
            double d22 = this.alpha;
            double d23 = (d22 * d15) + d9;
            double d24 = (d23 * d14) + d15;
            double pow2 = Math.pow(2.718281828459045d, (-d22) * d14) * d24;
            double pow3 = Math.pow(2.718281828459045d, (-this.alpha) * d14) * d24;
            double d25 = -this.alpha;
            cos = (Math.pow(2.718281828459045d, d25 * d14) * d23) + (pow3 * d25);
            sin = pow2;
        } else {
            double d26 = 1.0d / this.hotel;
            double d27 = this.alpha;
            double d28 = ((d16 * d27 * d15) + d9) * d26;
            sin = ((Math.sin(this.hotel * d14) * d28) + (Math.cos(this.hotel * d14) * d15)) * Math.pow(2.718281828459045d, (-d16) * d27 * d14);
            double d29 = this.alpha;
            double d30 = this.bravo;
            double d31 = (-d29) * sin * d30;
            double pow4 = Math.pow(2.718281828459045d, (-d30) * d29 * d14);
            double d32 = this.hotel;
            double sin2 = Math.sin(d32 * d14) * (-d32) * d15;
            double d33 = this.hotel;
            cos = (((Math.cos(d33 * d14) * d28 * d33) + sin2) * pow4) + d31;
        }
        float f5 = (float) (sin + this.india);
        G.a aVar = this.juliet;
        aVar.alpha = f5;
        aVar.bravo = (float) cos;
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, G.a] */
    public g(float f5) {
        this.alpha = Math.sqrt(1500.0d);
        this.bravo = 0.5d;
        this.charlie = false;
        this.juliet = new Object();
        this.india = f5;
    }
}
