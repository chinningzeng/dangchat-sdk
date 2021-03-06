package im.actor.core.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.runtime.bser.*;
import im.actor.runtime.collections.*;
import static im.actor.runtime.bser.Utils.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.j2objc.annotations.ObjectiveCName;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ApiParagraphStyle extends BserObject {

    private Boolean showParagraph;
    private ApiColor paragraphColor;
    private ApiColor bgColor;

    public ApiParagraphStyle(@Nullable Boolean showParagraph, @Nullable ApiColor paragraphColor, @Nullable ApiColor bgColor) {
        this.showParagraph = showParagraph;
        this.paragraphColor = paragraphColor;
        this.bgColor = bgColor;
    }

    public ApiParagraphStyle() {

    }

    @Nullable
    public Boolean showParagraph() {
        return this.showParagraph;
    }

    @Nullable
    public ApiColor getParagraphColor() {
        return this.paragraphColor;
    }

    @Nullable
    public ApiColor getBgColor() {
        return this.bgColor;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.showParagraph = values.optBool(1);
        if (values.optBytes(2) != null) {
            this.paragraphColor = ApiColor.fromBytes(values.getBytes(2));
        }
        if (values.optBytes(3) != null) {
            this.bgColor = ApiColor.fromBytes(values.getBytes(3));
        }
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        if (this.showParagraph != null) {
            writer.writeBool(1, this.showParagraph);
        }
        if (this.paragraphColor != null) {
            writer.writeBytes(2, this.paragraphColor.buildContainer());
        }
        if (this.bgColor != null) {
            writer.writeBytes(3, this.bgColor.buildContainer());
        }
    }

    @Override
    public String toString() {
        String res = "struct ParagraphStyle{";
        res += "showParagraph=" + this.showParagraph;
        res += ", paragraphColor=" + this.paragraphColor;
        res += ", bgColor=" + this.bgColor;
        res += "}";
        return res;
    }

}
