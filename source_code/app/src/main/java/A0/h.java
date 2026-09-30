package A0;

/* loaded from: classes3.dex */
public final class h {
    public final int alpha;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (this.alpha != ((h) obj).alpha) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha;
    }

    public final String toString() {
        int i4 = this.alpha;
        if (i4 == 0) {
            return "Button";
        }
        if (i4 == 1) {
            return "Checkbox";
        }
        if (i4 == 2) {
            return "Switch";
        }
        if (i4 == 3) {
            return "RadioButton";
        }
        if (i4 == 4) {
            return "Tab";
        }
        if (i4 == 5) {
            return "Image";
        }
        if (i4 == 6) {
            return "DropdownList";
        }
        if (i4 == 7) {
            return "Picker";
        }
        if (i4 == 8) {
            return "Carousel";
        }
        return "Unknown";
    }
}
