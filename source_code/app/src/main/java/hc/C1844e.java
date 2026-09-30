package hc;

import B9.aq;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w;
import delivery.samurai.android.R;
import ja.burhanrashid52.photoeditor.PhotoEditor;
import ja.burhanrashid52.photoeditor.PhotoEditorView;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhc/e;", "Landroidx/fragment/app/w;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: hc.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1844e extends DialogInterfaceOnCancelListenerC0627w {

    /* renamed from: j, reason: collision with root package name */
    public aq f12715j;

    /* renamed from: k, reason: collision with root package name */
    public PhotoEditor f12716k;

    /* renamed from: l, reason: collision with root package name */
    public final ShapeBuilder f12717l = new ShapeBuilder();

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        papa(0, R.style.App_FullScreenDialog);
        oscar(false);
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater i4, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(i4, "i");
        View inflate = getLayoutInflater().inflate(R.layout.dialog_photo_editor, (ViewGroup) null, false);
        int i5 = R.id.btnClear;
        Button button = (Button) S3.bravo(R.id.btnClear, inflate);
        if (button != null) {
            i5 = R.id.btnColorBlack;
            View bravo = S3.bravo(R.id.btnColorBlack, inflate);
            if (bravo != null) {
                i5 = R.id.btnColorBlue;
                View bravo2 = S3.bravo(R.id.btnColorBlue, inflate);
                if (bravo2 != null) {
                    i5 = R.id.btnColorGreen;
                    View bravo3 = S3.bravo(R.id.btnColorGreen, inflate);
                    if (bravo3 != null) {
                        i5 = R.id.btnColorRed;
                        View bravo4 = S3.bravo(R.id.btnColorRed, inflate);
                        if (bravo4 != null) {
                            i5 = R.id.btnColorYellow;
                            View bravo5 = S3.bravo(R.id.btnColorYellow, inflate);
                            if (bravo5 != null) {
                                i5 = R.id.btnDone;
                                Button button2 = (Button) S3.bravo(R.id.btnDone, inflate);
                                if (button2 != null) {
                                    i5 = R.id.btnSkip;
                                    Button button3 = (Button) S3.bravo(R.id.btnSkip, inflate);
                                    if (button3 != null) {
                                        i5 = R.id.btnUndo;
                                        Button button4 = (Button) S3.bravo(R.id.btnUndo, inflate);
                                        if (button4 != null) {
                                            i5 = R.id.panelTools;
                                            if (((LinearLayout) S3.bravo(R.id.panelTools, inflate)) != null) {
                                                i5 = R.id.photoEditorView;
                                                PhotoEditorView photoEditorView = (PhotoEditorView) S3.bravo(R.id.photoEditorView, inflate);
                                                if (photoEditorView != null) {
                                                    i5 = R.id.progressSaving;
                                                    ProgressBar progressBar = (ProgressBar) S3.bravo(R.id.progressSaving, inflate);
                                                    if (progressBar != null) {
                                                        i5 = R.id.seekBrush;
                                                        SeekBar seekBar = (SeekBar) S3.bravo(R.id.seekBrush, inflate);
                                                        if (seekBar != null) {
                                                            i5 = R.id.topBar;
                                                            if (((LinearLayout) S3.bravo(R.id.topBar, inflate)) != null) {
                                                                i5 = R.id.tvBrushSize;
                                                                TextView textView = (TextView) S3.bravo(R.id.tvBrushSize, inflate);
                                                                if (textView != null) {
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                    this.f12715j = new aq(constraintLayout, button, bravo, bravo2, bravo3, bravo4, bravo5, button2, button3, button4, photoEditorView, progressBar, seekBar, textView);
                                                                    Intrinsics.delta(constraintLayout, "getRoot(...)");
                                                                    return constraintLayout;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStart() {
        super.onStart();
        Dialog dialog = this.e;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        final String str;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("IMAGE_PATH");
        } else {
            str = null;
        }
        if (str == null) {
            lima(false, false);
            return;
        }
        aq aqVar = this.f12715j;
        if (aqVar != null) {
            aqVar.juliet.getSource().setImageURI(Uri.fromFile(new File(str)));
            aq aqVar2 = this.f12715j;
            if (aqVar2 != null) {
                ImageView source = aqVar2.juliet.getSource();
                source.setAdjustViewBounds(true);
                source.setScaleType(ImageView.ScaleType.FIT_CENTER);
                Context requireContext = requireContext();
                Intrinsics.delta(requireContext, "requireContext(...)");
                aq aqVar3 = this.f12715j;
                if (aqVar3 != null) {
                    PhotoEditor build = new PhotoEditor.Builder(requireContext, aqVar3.juliet).setPinchTextScalable(false).setClipSourceImage(true).build();
                    this.f12716k = build;
                    if (build != null) {
                        build.setBrushDrawingMode(true);
                        PhotoEditor photoEditor = this.f12716k;
                        if (photoEditor != null) {
                            photoEditor.setShape(this.f12717l.withShapeColor(-65536));
                            aq aqVar4 = this.f12715j;
                            if (aqVar4 != null) {
                                aqVar4.lima.setMax(80);
                                aq aqVar5 = this.f12715j;
                                if (aqVar5 != null) {
                                    aqVar5.lima.setProgress(20);
                                    aq aqVar6 = this.f12715j;
                                    if (aqVar6 != null) {
                                        aqVar6.mike.setText(String.valueOf(aqVar6.lima.getProgress()));
                                        aq aqVar7 = this.f12715j;
                                        if (aqVar7 != null) {
                                            aqVar7.lima.setOnSeekBarChangeListener(new C1843d(this));
                                            aq aqVar8 = this.f12715j;
                                            if (aqVar8 != null) {
                                                final int i4 = 0;
                                                aqVar8.bravo.setOnClickListener(new View.OnClickListener(this) { // from class: hc.a
                                                    public final /* synthetic */ C1844e purple;

                                                    {
                                                        this.purple = this;
                                                    }

                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view2) {
                                                        switch (i4) {
                                                            case 0:
                                                                C1844e c1844e = this.purple;
                                                                PhotoEditor photoEditor2 = c1844e.f12716k;
                                                                if (photoEditor2 != null) {
                                                                    photoEditor2.setShape(c1844e.f12717l.withShapeColor(ShapeBuilder.DEFAULT_SHAPE_COLOR));
                                                                    return;
                                                                } else {
                                                                    Intrinsics.lima("photoEditor");
                                                                    throw null;
                                                                }
                                                            case 1:
                                                                C1844e c1844e2 = this.purple;
                                                                PhotoEditor photoEditor3 = c1844e2.f12716k;
                                                                if (photoEditor3 != null) {
                                                                    photoEditor3.setShape(c1844e2.f12717l.withShapeColor(-65536));
                                                                    return;
                                                                } else {
                                                                    Intrinsics.lima("photoEditor");
                                                                    throw null;
                                                                }
                                                            case 2:
                                                                C1844e c1844e3 = this.purple;
                                                                PhotoEditor photoEditor4 = c1844e3.f12716k;
                                                                if (photoEditor4 != null) {
                                                                    photoEditor4.setShape(c1844e3.f12717l.withShapeColor(-256));
                                                                    return;
                                                                } else {
                                                                    Intrinsics.lima("photoEditor");
                                                                    throw null;
                                                                }
                                                            case 3:
                                                                C1844e c1844e4 = this.purple;
                                                                PhotoEditor photoEditor5 = c1844e4.f12716k;
                                                                if (photoEditor5 != null) {
                                                                    photoEditor5.setShape(c1844e4.f12717l.withShapeColor(-16711936));
                                                                    return;
                                                                } else {
                                                                    Intrinsics.lima("photoEditor");
                                                                    throw null;
                                                                }
                                                            case 4:
                                                                C1844e c1844e5 = this.purple;
                                                                PhotoEditor photoEditor6 = c1844e5.f12716k;
                                                                if (photoEditor6 != null) {
                                                                    photoEditor6.setShape(c1844e5.f12717l.withShapeColor(-16776961));
                                                                    return;
                                                                } else {
                                                                    Intrinsics.lima("photoEditor");
                                                                    throw null;
                                                                }
                                                            case 5:
                                                                PhotoEditor photoEditor7 = this.purple.f12716k;
                                                                if (photoEditor7 != null) {
                                                                    photoEditor7.undo();
                                                                    return;
                                                                } else {
                                                                    Intrinsics.lima("photoEditor");
                                                                    throw null;
                                                                }
                                                            default:
                                                                PhotoEditor photoEditor8 = this.purple.f12716k;
                                                                if (photoEditor8 != null) {
                                                                    photoEditor8.clearAllViews();
                                                                    return;
                                                                } else {
                                                                    Intrinsics.lima("photoEditor");
                                                                    throw null;
                                                                }
                                                        }
                                                    }
                                                });
                                                aq aqVar9 = this.f12715j;
                                                if (aqVar9 != null) {
                                                    final int i5 = 1;
                                                    aqVar9.echo.setOnClickListener(new View.OnClickListener(this) { // from class: hc.a
                                                        public final /* synthetic */ C1844e purple;

                                                        {
                                                            this.purple = this;
                                                        }

                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view2) {
                                                            switch (i5) {
                                                                case 0:
                                                                    C1844e c1844e = this.purple;
                                                                    PhotoEditor photoEditor2 = c1844e.f12716k;
                                                                    if (photoEditor2 != null) {
                                                                        photoEditor2.setShape(c1844e.f12717l.withShapeColor(ShapeBuilder.DEFAULT_SHAPE_COLOR));
                                                                        return;
                                                                    } else {
                                                                        Intrinsics.lima("photoEditor");
                                                                        throw null;
                                                                    }
                                                                case 1:
                                                                    C1844e c1844e2 = this.purple;
                                                                    PhotoEditor photoEditor3 = c1844e2.f12716k;
                                                                    if (photoEditor3 != null) {
                                                                        photoEditor3.setShape(c1844e2.f12717l.withShapeColor(-65536));
                                                                        return;
                                                                    } else {
                                                                        Intrinsics.lima("photoEditor");
                                                                        throw null;
                                                                    }
                                                                case 2:
                                                                    C1844e c1844e3 = this.purple;
                                                                    PhotoEditor photoEditor4 = c1844e3.f12716k;
                                                                    if (photoEditor4 != null) {
                                                                        photoEditor4.setShape(c1844e3.f12717l.withShapeColor(-256));
                                                                        return;
                                                                    } else {
                                                                        Intrinsics.lima("photoEditor");
                                                                        throw null;
                                                                    }
                                                                case 3:
                                                                    C1844e c1844e4 = this.purple;
                                                                    PhotoEditor photoEditor5 = c1844e4.f12716k;
                                                                    if (photoEditor5 != null) {
                                                                        photoEditor5.setShape(c1844e4.f12717l.withShapeColor(-16711936));
                                                                        return;
                                                                    } else {
                                                                        Intrinsics.lima("photoEditor");
                                                                        throw null;
                                                                    }
                                                                case 4:
                                                                    C1844e c1844e5 = this.purple;
                                                                    PhotoEditor photoEditor6 = c1844e5.f12716k;
                                                                    if (photoEditor6 != null) {
                                                                        photoEditor6.setShape(c1844e5.f12717l.withShapeColor(-16776961));
                                                                        return;
                                                                    } else {
                                                                        Intrinsics.lima("photoEditor");
                                                                        throw null;
                                                                    }
                                                                case 5:
                                                                    PhotoEditor photoEditor7 = this.purple.f12716k;
                                                                    if (photoEditor7 != null) {
                                                                        photoEditor7.undo();
                                                                        return;
                                                                    } else {
                                                                        Intrinsics.lima("photoEditor");
                                                                        throw null;
                                                                    }
                                                                default:
                                                                    PhotoEditor photoEditor8 = this.purple.f12716k;
                                                                    if (photoEditor8 != null) {
                                                                        photoEditor8.clearAllViews();
                                                                        return;
                                                                    } else {
                                                                        Intrinsics.lima("photoEditor");
                                                                        throw null;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    aq aqVar10 = this.f12715j;
                                                    if (aqVar10 != null) {
                                                        final int i10 = 2;
                                                        aqVar10.foxtrot.setOnClickListener(new View.OnClickListener(this) { // from class: hc.a
                                                            public final /* synthetic */ C1844e purple;

                                                            {
                                                                this.purple = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view2) {
                                                                switch (i10) {
                                                                    case 0:
                                                                        C1844e c1844e = this.purple;
                                                                        PhotoEditor photoEditor2 = c1844e.f12716k;
                                                                        if (photoEditor2 != null) {
                                                                            photoEditor2.setShape(c1844e.f12717l.withShapeColor(ShapeBuilder.DEFAULT_SHAPE_COLOR));
                                                                            return;
                                                                        } else {
                                                                            Intrinsics.lima("photoEditor");
                                                                            throw null;
                                                                        }
                                                                    case 1:
                                                                        C1844e c1844e2 = this.purple;
                                                                        PhotoEditor photoEditor3 = c1844e2.f12716k;
                                                                        if (photoEditor3 != null) {
                                                                            photoEditor3.setShape(c1844e2.f12717l.withShapeColor(-65536));
                                                                            return;
                                                                        } else {
                                                                            Intrinsics.lima("photoEditor");
                                                                            throw null;
                                                                        }
                                                                    case 2:
                                                                        C1844e c1844e3 = this.purple;
                                                                        PhotoEditor photoEditor4 = c1844e3.f12716k;
                                                                        if (photoEditor4 != null) {
                                                                            photoEditor4.setShape(c1844e3.f12717l.withShapeColor(-256));
                                                                            return;
                                                                        } else {
                                                                            Intrinsics.lima("photoEditor");
                                                                            throw null;
                                                                        }
                                                                    case 3:
                                                                        C1844e c1844e4 = this.purple;
                                                                        PhotoEditor photoEditor5 = c1844e4.f12716k;
                                                                        if (photoEditor5 != null) {
                                                                            photoEditor5.setShape(c1844e4.f12717l.withShapeColor(-16711936));
                                                                            return;
                                                                        } else {
                                                                            Intrinsics.lima("photoEditor");
                                                                            throw null;
                                                                        }
                                                                    case 4:
                                                                        C1844e c1844e5 = this.purple;
                                                                        PhotoEditor photoEditor6 = c1844e5.f12716k;
                                                                        if (photoEditor6 != null) {
                                                                            photoEditor6.setShape(c1844e5.f12717l.withShapeColor(-16776961));
                                                                            return;
                                                                        } else {
                                                                            Intrinsics.lima("photoEditor");
                                                                            throw null;
                                                                        }
                                                                    case 5:
                                                                        PhotoEditor photoEditor7 = this.purple.f12716k;
                                                                        if (photoEditor7 != null) {
                                                                            photoEditor7.undo();
                                                                            return;
                                                                        } else {
                                                                            Intrinsics.lima("photoEditor");
                                                                            throw null;
                                                                        }
                                                                    default:
                                                                        PhotoEditor photoEditor8 = this.purple.f12716k;
                                                                        if (photoEditor8 != null) {
                                                                            photoEditor8.clearAllViews();
                                                                            return;
                                                                        } else {
                                                                            Intrinsics.lima("photoEditor");
                                                                            throw null;
                                                                        }
                                                                }
                                                            }
                                                        });
                                                        aq aqVar11 = this.f12715j;
                                                        if (aqVar11 != null) {
                                                            final int i11 = 3;
                                                            aqVar11.delta.setOnClickListener(new View.OnClickListener(this) { // from class: hc.a
                                                                public final /* synthetic */ C1844e purple;

                                                                {
                                                                    this.purple = this;
                                                                }

                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view2) {
                                                                    switch (i11) {
                                                                        case 0:
                                                                            C1844e c1844e = this.purple;
                                                                            PhotoEditor photoEditor2 = c1844e.f12716k;
                                                                            if (photoEditor2 != null) {
                                                                                photoEditor2.setShape(c1844e.f12717l.withShapeColor(ShapeBuilder.DEFAULT_SHAPE_COLOR));
                                                                                return;
                                                                            } else {
                                                                                Intrinsics.lima("photoEditor");
                                                                                throw null;
                                                                            }
                                                                        case 1:
                                                                            C1844e c1844e2 = this.purple;
                                                                            PhotoEditor photoEditor3 = c1844e2.f12716k;
                                                                            if (photoEditor3 != null) {
                                                                                photoEditor3.setShape(c1844e2.f12717l.withShapeColor(-65536));
                                                                                return;
                                                                            } else {
                                                                                Intrinsics.lima("photoEditor");
                                                                                throw null;
                                                                            }
                                                                        case 2:
                                                                            C1844e c1844e3 = this.purple;
                                                                            PhotoEditor photoEditor4 = c1844e3.f12716k;
                                                                            if (photoEditor4 != null) {
                                                                                photoEditor4.setShape(c1844e3.f12717l.withShapeColor(-256));
                                                                                return;
                                                                            } else {
                                                                                Intrinsics.lima("photoEditor");
                                                                                throw null;
                                                                            }
                                                                        case 3:
                                                                            C1844e c1844e4 = this.purple;
                                                                            PhotoEditor photoEditor5 = c1844e4.f12716k;
                                                                            if (photoEditor5 != null) {
                                                                                photoEditor5.setShape(c1844e4.f12717l.withShapeColor(-16711936));
                                                                                return;
                                                                            } else {
                                                                                Intrinsics.lima("photoEditor");
                                                                                throw null;
                                                                            }
                                                                        case 4:
                                                                            C1844e c1844e5 = this.purple;
                                                                            PhotoEditor photoEditor6 = c1844e5.f12716k;
                                                                            if (photoEditor6 != null) {
                                                                                photoEditor6.setShape(c1844e5.f12717l.withShapeColor(-16776961));
                                                                                return;
                                                                            } else {
                                                                                Intrinsics.lima("photoEditor");
                                                                                throw null;
                                                                            }
                                                                        case 5:
                                                                            PhotoEditor photoEditor7 = this.purple.f12716k;
                                                                            if (photoEditor7 != null) {
                                                                                photoEditor7.undo();
                                                                                return;
                                                                            } else {
                                                                                Intrinsics.lima("photoEditor");
                                                                                throw null;
                                                                            }
                                                                        default:
                                                                            PhotoEditor photoEditor8 = this.purple.f12716k;
                                                                            if (photoEditor8 != null) {
                                                                                photoEditor8.clearAllViews();
                                                                                return;
                                                                            } else {
                                                                                Intrinsics.lima("photoEditor");
                                                                                throw null;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            aq aqVar12 = this.f12715j;
                                                            if (aqVar12 != null) {
                                                                final int i12 = 4;
                                                                aqVar12.charlie.setOnClickListener(new View.OnClickListener(this) { // from class: hc.a
                                                                    public final /* synthetic */ C1844e purple;

                                                                    {
                                                                        this.purple = this;
                                                                    }

                                                                    @Override // android.view.View.OnClickListener
                                                                    public final void onClick(View view2) {
                                                                        switch (i12) {
                                                                            case 0:
                                                                                C1844e c1844e = this.purple;
                                                                                PhotoEditor photoEditor2 = c1844e.f12716k;
                                                                                if (photoEditor2 != null) {
                                                                                    photoEditor2.setShape(c1844e.f12717l.withShapeColor(ShapeBuilder.DEFAULT_SHAPE_COLOR));
                                                                                    return;
                                                                                } else {
                                                                                    Intrinsics.lima("photoEditor");
                                                                                    throw null;
                                                                                }
                                                                            case 1:
                                                                                C1844e c1844e2 = this.purple;
                                                                                PhotoEditor photoEditor3 = c1844e2.f12716k;
                                                                                if (photoEditor3 != null) {
                                                                                    photoEditor3.setShape(c1844e2.f12717l.withShapeColor(-65536));
                                                                                    return;
                                                                                } else {
                                                                                    Intrinsics.lima("photoEditor");
                                                                                    throw null;
                                                                                }
                                                                            case 2:
                                                                                C1844e c1844e3 = this.purple;
                                                                                PhotoEditor photoEditor4 = c1844e3.f12716k;
                                                                                if (photoEditor4 != null) {
                                                                                    photoEditor4.setShape(c1844e3.f12717l.withShapeColor(-256));
                                                                                    return;
                                                                                } else {
                                                                                    Intrinsics.lima("photoEditor");
                                                                                    throw null;
                                                                                }
                                                                            case 3:
                                                                                C1844e c1844e4 = this.purple;
                                                                                PhotoEditor photoEditor5 = c1844e4.f12716k;
                                                                                if (photoEditor5 != null) {
                                                                                    photoEditor5.setShape(c1844e4.f12717l.withShapeColor(-16711936));
                                                                                    return;
                                                                                } else {
                                                                                    Intrinsics.lima("photoEditor");
                                                                                    throw null;
                                                                                }
                                                                            case 4:
                                                                                C1844e c1844e5 = this.purple;
                                                                                PhotoEditor photoEditor6 = c1844e5.f12716k;
                                                                                if (photoEditor6 != null) {
                                                                                    photoEditor6.setShape(c1844e5.f12717l.withShapeColor(-16776961));
                                                                                    return;
                                                                                } else {
                                                                                    Intrinsics.lima("photoEditor");
                                                                                    throw null;
                                                                                }
                                                                            case 5:
                                                                                PhotoEditor photoEditor7 = this.purple.f12716k;
                                                                                if (photoEditor7 != null) {
                                                                                    photoEditor7.undo();
                                                                                    return;
                                                                                } else {
                                                                                    Intrinsics.lima("photoEditor");
                                                                                    throw null;
                                                                                }
                                                                            default:
                                                                                PhotoEditor photoEditor8 = this.purple.f12716k;
                                                                                if (photoEditor8 != null) {
                                                                                    photoEditor8.clearAllViews();
                                                                                    return;
                                                                                } else {
                                                                                    Intrinsics.lima("photoEditor");
                                                                                    throw null;
                                                                                }
                                                                        }
                                                                    }
                                                                });
                                                                aq aqVar13 = this.f12715j;
                                                                if (aqVar13 != null) {
                                                                    final int i13 = 5;
                                                                    aqVar13.india.setOnClickListener(new View.OnClickListener(this) { // from class: hc.a
                                                                        public final /* synthetic */ C1844e purple;

                                                                        {
                                                                            this.purple = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view2) {
                                                                            switch (i13) {
                                                                                case 0:
                                                                                    C1844e c1844e = this.purple;
                                                                                    PhotoEditor photoEditor2 = c1844e.f12716k;
                                                                                    if (photoEditor2 != null) {
                                                                                        photoEditor2.setShape(c1844e.f12717l.withShapeColor(ShapeBuilder.DEFAULT_SHAPE_COLOR));
                                                                                        return;
                                                                                    } else {
                                                                                        Intrinsics.lima("photoEditor");
                                                                                        throw null;
                                                                                    }
                                                                                case 1:
                                                                                    C1844e c1844e2 = this.purple;
                                                                                    PhotoEditor photoEditor3 = c1844e2.f12716k;
                                                                                    if (photoEditor3 != null) {
                                                                                        photoEditor3.setShape(c1844e2.f12717l.withShapeColor(-65536));
                                                                                        return;
                                                                                    } else {
                                                                                        Intrinsics.lima("photoEditor");
                                                                                        throw null;
                                                                                    }
                                                                                case 2:
                                                                                    C1844e c1844e3 = this.purple;
                                                                                    PhotoEditor photoEditor4 = c1844e3.f12716k;
                                                                                    if (photoEditor4 != null) {
                                                                                        photoEditor4.setShape(c1844e3.f12717l.withShapeColor(-256));
                                                                                        return;
                                                                                    } else {
                                                                                        Intrinsics.lima("photoEditor");
                                                                                        throw null;
                                                                                    }
                                                                                case 3:
                                                                                    C1844e c1844e4 = this.purple;
                                                                                    PhotoEditor photoEditor5 = c1844e4.f12716k;
                                                                                    if (photoEditor5 != null) {
                                                                                        photoEditor5.setShape(c1844e4.f12717l.withShapeColor(-16711936));
                                                                                        return;
                                                                                    } else {
                                                                                        Intrinsics.lima("photoEditor");
                                                                                        throw null;
                                                                                    }
                                                                                case 4:
                                                                                    C1844e c1844e5 = this.purple;
                                                                                    PhotoEditor photoEditor6 = c1844e5.f12716k;
                                                                                    if (photoEditor6 != null) {
                                                                                        photoEditor6.setShape(c1844e5.f12717l.withShapeColor(-16776961));
                                                                                        return;
                                                                                    } else {
                                                                                        Intrinsics.lima("photoEditor");
                                                                                        throw null;
                                                                                    }
                                                                                case 5:
                                                                                    PhotoEditor photoEditor7 = this.purple.f12716k;
                                                                                    if (photoEditor7 != null) {
                                                                                        photoEditor7.undo();
                                                                                        return;
                                                                                    } else {
                                                                                        Intrinsics.lima("photoEditor");
                                                                                        throw null;
                                                                                    }
                                                                                default:
                                                                                    PhotoEditor photoEditor8 = this.purple.f12716k;
                                                                                    if (photoEditor8 != null) {
                                                                                        photoEditor8.clearAllViews();
                                                                                        return;
                                                                                    } else {
                                                                                        Intrinsics.lima("photoEditor");
                                                                                        throw null;
                                                                                    }
                                                                            }
                                                                        }
                                                                    });
                                                                    aq aqVar14 = this.f12715j;
                                                                    if (aqVar14 != null) {
                                                                        final int i14 = 6;
                                                                        aqVar14.alpha.setOnClickListener(new View.OnClickListener(this) { // from class: hc.a
                                                                            public final /* synthetic */ C1844e purple;

                                                                            {
                                                                                this.purple = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view2) {
                                                                                switch (i14) {
                                                                                    case 0:
                                                                                        C1844e c1844e = this.purple;
                                                                                        PhotoEditor photoEditor2 = c1844e.f12716k;
                                                                                        if (photoEditor2 != null) {
                                                                                            photoEditor2.setShape(c1844e.f12717l.withShapeColor(ShapeBuilder.DEFAULT_SHAPE_COLOR));
                                                                                            return;
                                                                                        } else {
                                                                                            Intrinsics.lima("photoEditor");
                                                                                            throw null;
                                                                                        }
                                                                                    case 1:
                                                                                        C1844e c1844e2 = this.purple;
                                                                                        PhotoEditor photoEditor3 = c1844e2.f12716k;
                                                                                        if (photoEditor3 != null) {
                                                                                            photoEditor3.setShape(c1844e2.f12717l.withShapeColor(-65536));
                                                                                            return;
                                                                                        } else {
                                                                                            Intrinsics.lima("photoEditor");
                                                                                            throw null;
                                                                                        }
                                                                                    case 2:
                                                                                        C1844e c1844e3 = this.purple;
                                                                                        PhotoEditor photoEditor4 = c1844e3.f12716k;
                                                                                        if (photoEditor4 != null) {
                                                                                            photoEditor4.setShape(c1844e3.f12717l.withShapeColor(-256));
                                                                                            return;
                                                                                        } else {
                                                                                            Intrinsics.lima("photoEditor");
                                                                                            throw null;
                                                                                        }
                                                                                    case 3:
                                                                                        C1844e c1844e4 = this.purple;
                                                                                        PhotoEditor photoEditor5 = c1844e4.f12716k;
                                                                                        if (photoEditor5 != null) {
                                                                                            photoEditor5.setShape(c1844e4.f12717l.withShapeColor(-16711936));
                                                                                            return;
                                                                                        } else {
                                                                                            Intrinsics.lima("photoEditor");
                                                                                            throw null;
                                                                                        }
                                                                                    case 4:
                                                                                        C1844e c1844e5 = this.purple;
                                                                                        PhotoEditor photoEditor6 = c1844e5.f12716k;
                                                                                        if (photoEditor6 != null) {
                                                                                            photoEditor6.setShape(c1844e5.f12717l.withShapeColor(-16776961));
                                                                                            return;
                                                                                        } else {
                                                                                            Intrinsics.lima("photoEditor");
                                                                                            throw null;
                                                                                        }
                                                                                    case 5:
                                                                                        PhotoEditor photoEditor7 = this.purple.f12716k;
                                                                                        if (photoEditor7 != null) {
                                                                                            photoEditor7.undo();
                                                                                            return;
                                                                                        } else {
                                                                                            Intrinsics.lima("photoEditor");
                                                                                            throw null;
                                                                                        }
                                                                                    default:
                                                                                        PhotoEditor photoEditor8 = this.purple.f12716k;
                                                                                        if (photoEditor8 != null) {
                                                                                            photoEditor8.clearAllViews();
                                                                                            return;
                                                                                        } else {
                                                                                            Intrinsics.lima("photoEditor");
                                                                                            throw null;
                                                                                        }
                                                                                }
                                                                            }
                                                                        });
                                                                        aq aqVar15 = this.f12715j;
                                                                        if (aqVar15 != null) {
                                                                            final int i15 = 0;
                                                                            aqVar15.golf.setOnClickListener(new View.OnClickListener(this) { // from class: hc.b
                                                                                public final /* synthetic */ C1844e purple;

                                                                                {
                                                                                    this.purple = this;
                                                                                }

                                                                                @Override // android.view.View.OnClickListener
                                                                                public final void onClick(View view2) {
                                                                                    switch (i15) {
                                                                                        case 0:
                                                                                            this.purple.sierra(str);
                                                                                            return;
                                                                                        default:
                                                                                            C1844e c1844e = this.purple;
                                                                                            PhotoEditor photoEditor2 = c1844e.f12716k;
                                                                                            if (photoEditor2 != null) {
                                                                                                photoEditor2.clearAllViews();
                                                                                                c1844e.sierra(str);
                                                                                                return;
                                                                                            } else {
                                                                                                Intrinsics.lima("photoEditor");
                                                                                                throw null;
                                                                                            }
                                                                                    }
                                                                                }
                                                                            });
                                                                            aq aqVar16 = this.f12715j;
                                                                            if (aqVar16 != null) {
                                                                                final int i16 = 1;
                                                                                aqVar16.hotel.setOnClickListener(new View.OnClickListener(this) { // from class: hc.b
                                                                                    public final /* synthetic */ C1844e purple;

                                                                                    {
                                                                                        this.purple = this;
                                                                                    }

                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view2) {
                                                                                        switch (i16) {
                                                                                            case 0:
                                                                                                this.purple.sierra(str);
                                                                                                return;
                                                                                            default:
                                                                                                C1844e c1844e = this.purple;
                                                                                                PhotoEditor photoEditor2 = c1844e.f12716k;
                                                                                                if (photoEditor2 != null) {
                                                                                                    photoEditor2.clearAllViews();
                                                                                                    c1844e.sierra(str);
                                                                                                    return;
                                                                                                } else {
                                                                                                    Intrinsics.lima("photoEditor");
                                                                                                    throw null;
                                                                                                }
                                                                                        }
                                                                                    }
                                                                                });
                                                                                return;
                                                                            }
                                                                            Intrinsics.lima("binding");
                                                                            throw null;
                                                                        }
                                                                        Intrinsics.lima("binding");
                                                                        throw null;
                                                                    }
                                                                    Intrinsics.lima("binding");
                                                                    throw null;
                                                                }
                                                                Intrinsics.lima("binding");
                                                                throw null;
                                                            }
                                                            Intrinsics.lima("binding");
                                                            throw null;
                                                        }
                                                        Intrinsics.lima("binding");
                                                        throw null;
                                                    }
                                                    Intrinsics.lima("binding");
                                                    throw null;
                                                }
                                                Intrinsics.lima("binding");
                                                throw null;
                                            }
                                            Intrinsics.lima("binding");
                                            throw null;
                                        }
                                        Intrinsics.lima("binding");
                                        throw null;
                                    }
                                    Intrinsics.lima("binding");
                                    throw null;
                                }
                                Intrinsics.lima("binding");
                                throw null;
                            }
                            Intrinsics.lima("binding");
                            throw null;
                        }
                        Intrinsics.lima("photoEditor");
                        throw null;
                    }
                    Intrinsics.lima("photoEditor");
                    throw null;
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final void sierra(String str) {
        tango(true);
        PhotoEditor photoEditor = this.f12716k;
        if (photoEditor != null) {
            photoEditor.saveAsFile(str, new C1842c(this));
        } else {
            Intrinsics.lima("photoEditor");
            throw null;
        }
    }

    public final void tango(boolean z2) {
        int i4;
        aq aqVar = this.f12715j;
        if (aqVar != null) {
            if (z2) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            aqVar.kilo.setVisibility(i4);
            aq aqVar2 = this.f12715j;
            if (aqVar2 != null) {
                boolean z10 = !z2;
                aqVar2.golf.setEnabled(z10);
                aq aqVar3 = this.f12715j;
                if (aqVar3 != null) {
                    aqVar3.india.setEnabled(z10);
                    aq aqVar4 = this.f12715j;
                    if (aqVar4 != null) {
                        aqVar4.alpha.setEnabled(z10);
                        aq aqVar5 = this.f12715j;
                        if (aqVar5 != null) {
                            aqVar5.hotel.setEnabled(z10);
                            return;
                        } else {
                            Intrinsics.lima("binding");
                            throw null;
                        }
                    }
                    Intrinsics.lima("binding");
                    throw null;
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
