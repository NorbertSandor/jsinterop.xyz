package xyz.jsinterop.client.dom;

/*
 * #%L
 * jsinterop
 * %%
 * Copyright (C) 2016 Norbert Sándor
 * %%
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * #L%
 */

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface CanvasRenderingContext2D {
	@JsProperty
	public abstract HTMLCanvasElement getCanvas();

	@JsProperty
	public abstract void setCanvas(final HTMLCanvasElement value);

	@JsProperty
	public abstract Object getFillStyle();

	@JsProperty
	public abstract void setFillStyle(final Object value);

	@JsProperty
	public abstract String getFont();

	@JsProperty
	public abstract void setFont(final String value);

	@JsProperty
	public abstract double getGlobalAlpha();

	@JsProperty
	public abstract void setGlobalAlpha(final double value);

	@JsProperty
	public abstract String getGlobalCompositeOperation();

	@JsProperty
	public abstract void setGlobalCompositeOperation(final String value);

	@JsProperty
	public abstract String getLineCap();

	@JsProperty
	public abstract void setLineCap(final String value);

	@JsProperty
	public abstract double getLineDashOffset();

	@JsProperty
	public abstract void setLineDashOffset(final double value);

	@JsProperty
	public abstract String getLineJoin();

	@JsProperty
	public abstract void setLineJoin(final String value);

	@JsProperty
	public abstract double getLineWidth();

	@JsProperty
	public abstract void setLineWidth(final double value);

	@JsProperty
	public abstract double getMiterLimit();

	@JsProperty
	public abstract void setMiterLimit(final double value);

	@JsProperty
	public abstract String getMsFillRule();

	@JsProperty
	public abstract void setMsFillRule(final String value);

	@JsProperty
	public abstract boolean isMsImageSmoothingEnabled();

	@JsProperty
	public abstract void setMsImageSmoothingEnabled(final boolean value);

	@JsProperty
	public abstract double getShadowBlur();

	@JsProperty
	public abstract void setShadowBlur(final double value);

	@JsProperty
	public abstract String getShadowColor();

	@JsProperty
	public abstract void setShadowColor(final String value);

	@JsProperty
	public abstract double getShadowOffsetX();

	@JsProperty
	public abstract void setShadowOffsetX(final double value);

	@JsProperty
	public abstract double getShadowOffsetY();

	@JsProperty
	public abstract void setShadowOffsetY(final double value);

	@JsProperty
	public abstract Object getStrokeStyle();

	@JsProperty
	public abstract void setStrokeStyle(final Object value);

	@JsProperty
	public abstract String getTextAlign();

	@JsProperty
	public abstract void setTextAlign(final String value);

	@JsProperty
	public abstract String getTextBaseline();

	@JsProperty
	public abstract void setTextBaseline(final String value);

	@JsMethod
	public abstract void arc(final double x, final double y, final double radius, final double startAngle,
			final double endAngle);

	@JsMethod
	public abstract void arc(final double x, final double y, final double radius, final double startAngle,
			final double endAngle, final boolean anticlockwise);

	@JsMethod
	public abstract void arcTo(final double x1, final double y1, final double x2, final double y2, final double radius);

	@JsMethod
	public abstract void beginPath();

	@JsMethod
	public abstract void bezierCurveTo(final double cp1x, final double cp1y, final double cp2x, final double cp2y,
			final double x, final double y);

	@JsMethod
	public abstract void clearRect(final double x, final double y, final double w, final double h);

	@JsMethod
	public abstract void clip();

	@JsMethod
	public abstract void clip(final String fillRule);

	@JsMethod
	public abstract void closePath();

	@JsMethod
	public abstract ImageData createImageData(final Object imageDataOrSw);

	@JsMethod
	public abstract ImageData createImageData(final Object imageDataOrSw, final double sh);

	@JsMethod
	public abstract CanvasGradient createLinearGradient(final double x0, final double y0, final double x1,
			final double y1);

	@JsMethod
	public abstract CanvasPattern createPattern(final Object image, final String repetition);

	@JsMethod
	public abstract CanvasGradient createRadialGradient(final double x0, final double y0, final double r0,
			final double x1, final double y1, final double r1);

	@JsMethod
	public abstract void drawImage(final Object image, final double offsetX, final double offsetY);

	@JsMethod
	public abstract void drawImage(final Object image, final double offsetX, final double offsetY, final double width);

	@JsMethod
	public abstract void drawImage(final Object image, final double offsetX, final double offsetY, final double width,
			final double height);

	@JsMethod
	public abstract void drawImage(final Object image, final double offsetX, final double offsetY, final double width,
			final double height, final double canvasOffsetX);

	@JsMethod
	public abstract void drawImage(final Object image, final double offsetX, final double offsetY, final double width,
			final double height, final double canvasOffsetX, final double canvasOffsetY);

	@JsMethod
	public abstract void drawImage(final Object image, final double offsetX, final double offsetY, final double width,
			final double height, final double canvasOffsetX, final double canvasOffsetY, final double canvasImageWidth);

	@JsMethod
	public abstract void drawImage(final Object image, final double offsetX, final double offsetY, final double width,
			final double height, final double canvasOffsetX, final double canvasOffsetY, final double canvasImageWidth,
			final double canvasImageHeight);

	@JsMethod
	public abstract void fill();

	@JsMethod
	public abstract void fill(final String fillRule);

	@JsMethod
	public abstract void fillRect(final double x, final double y, final double w, final double h);

	@JsMethod
	public abstract void fillText(final String text, final double x, final double y);

	@JsMethod
	public abstract void fillText(final String text, final double x, final double y, final double maxWidth);

	@JsMethod
	public abstract ImageData getImageData(final double sx, final double sy, final double sw, final double sh);

	@JsMethod
	public abstract Object getLineDash();

	@JsMethod
	public abstract boolean isPointInPath(final double x, final double y);

	@JsMethod
	public abstract boolean isPointInPath(final double x, final double y, final String fillRule);

	@JsMethod
	public abstract void lineTo(final double x, final double y);

	@JsMethod
	public abstract TextMetrics measureText(final String text);

	@JsMethod
	public abstract void moveTo(final double x, final double y);

	@JsMethod
	public abstract void putImageData(final ImageData imagedata, final double dx, final double dy);

	@JsMethod
	public abstract void putImageData(final ImageData imagedata, final double dx, final double dy, final double dirtyX);

	@JsMethod
	public abstract void putImageData(final ImageData imagedata, final double dx, final double dy, final double dirtyX,
			final double dirtyY);

	@JsMethod
	public abstract void putImageData(final ImageData imagedata, final double dx, final double dy, final double dirtyX,
			final double dirtyY, final double dirtyWidth);

	@JsMethod
	public abstract void putImageData(final ImageData imagedata, final double dx, final double dy, final double dirtyX,
			final double dirtyY, final double dirtyWidth, final double dirtyHeight);

	@JsMethod
	public abstract void quadraticCurveTo(final double cpx, final double cpy, final double x, final double y);

	@JsMethod
	public abstract void rect(final double x, final double y, final double w, final double h);

	@JsMethod
	public abstract void restore();

	@JsMethod
	public abstract void rotate(final double angle);

	@JsMethod
	public abstract void save();

	@JsMethod
	public abstract void scale(final double x, final double y);

	@JsMethod
	public abstract void setLineDash(final Object segments);

	@JsMethod
	public abstract void setTransform(final double m11, final double m12, final double m21, final double m22,
			final double dx, final double dy);

	@JsMethod
	public abstract void stroke();

	@JsMethod
	public abstract void strokeRect(final double x, final double y, final double w, final double h);

	@JsMethod
	public abstract void strokeText(final String text, final double x, final double y);

	@JsMethod
	public abstract void strokeText(final String text, final double x, final double y, final double maxWidth);

	@JsMethod
	public abstract void transform(final double m11, final double m12, final double m21, final double m22,
			final double dx, final double dy);

	@JsMethod
	public abstract void translate(final double x, final double y);
}
