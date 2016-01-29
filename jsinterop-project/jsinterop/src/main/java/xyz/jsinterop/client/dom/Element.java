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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface Element extends Node, GlobalEventHandlers, ElementTraversal, NodeSelector, ChildNode {
	@JsProperty
	public abstract DOMTokenList getClassList();

	@JsProperty
	public abstract void setClassList(final DOMTokenList value);

	@JsProperty
	public abstract double getClientHeight();

	@JsProperty
	public abstract void setClientHeight(final double value);

	@JsProperty
	public abstract double getClientLeft();

	@JsProperty
	public abstract void setClientLeft(final double value);

	@JsProperty
	public abstract double getClientTop();

	@JsProperty
	public abstract void setClientTop(final double value);

	@JsProperty
	public abstract double getClientWidth();

	@JsProperty
	public abstract void setClientWidth(final double value);

	@JsProperty
	public abstract double getMsContentZoomFactor();

	@JsProperty
	public abstract void setMsContentZoomFactor(final double value);

	@JsProperty
	public abstract String getMsRegionOverflow();

	@JsProperty
	public abstract void setMsRegionOverflow(final String value);

	@JsProperty
	public abstract EventListener<AriaRequestEvent> getOnariarequest();

	@JsProperty
	public abstract void setOnariarequest(final EventListener<AriaRequestEvent> value);

	@JsProperty
	public abstract EventListener<CommandEvent> getOncommand();

	@JsProperty
	public abstract void setOncommand(final EventListener<CommandEvent> value);

	@JsProperty
	public abstract EventListener<PointerEvent> getOngotpointercapture();

	@JsProperty
	public abstract void setOngotpointercapture(final EventListener<PointerEvent> value);

	@JsProperty
	public abstract EventListener<PointerEvent> getOnlostpointercapture();

	@JsProperty
	public abstract void setOnlostpointercapture(final EventListener<PointerEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgesturechange();

	@JsProperty
	public abstract void setOnmsgesturechange(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgesturedoubletap();

	@JsProperty
	public abstract void setOnmsgesturedoubletap(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgestureend();

	@JsProperty
	public abstract void setOnmsgestureend(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgesturehold();

	@JsProperty
	public abstract void setOnmsgesturehold(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgesturestart();

	@JsProperty
	public abstract void setOnmsgesturestart(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsgesturetap();

	@JsProperty
	public abstract void setOnmsgesturetap(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmsgotpointercapture();

	@JsProperty
	public abstract void setOnmsgotpointercapture(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSGestureEvent> getOnmsinertiastart();

	@JsProperty
	public abstract void setOnmsinertiastart(final EventListener<MSGestureEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmslostpointercapture();

	@JsProperty
	public abstract void setOnmslostpointercapture(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointercancel();

	@JsProperty
	public abstract void setOnmspointercancel(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerdown();

	@JsProperty
	public abstract void setOnmspointerdown(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerenter();

	@JsProperty
	public abstract void setOnmspointerenter(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerleave();

	@JsProperty
	public abstract void setOnmspointerleave(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointermove();

	@JsProperty
	public abstract void setOnmspointermove(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerout();

	@JsProperty
	public abstract void setOnmspointerout(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerover();

	@JsProperty
	public abstract void setOnmspointerover(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<MSPointerEvent> getOnmspointerup();

	@JsProperty
	public abstract void setOnmspointerup(final EventListener<MSPointerEvent> value);

	@JsProperty
	public abstract EventListener<TouchEvent> getOntouchcancel();

	@JsProperty
	public abstract void setOntouchcancel(final EventListener<TouchEvent> value);

	@JsProperty
	public abstract EventListener<TouchEvent> getOntouchend();

	@JsProperty
	public abstract void setOntouchend(final EventListener<TouchEvent> value);

	@JsProperty
	public abstract EventListener<TouchEvent> getOntouchmove();

	@JsProperty
	public abstract void setOntouchmove(final EventListener<TouchEvent> value);

	@JsProperty
	public abstract EventListener<TouchEvent> getOntouchstart();

	@JsProperty
	public abstract void setOntouchstart(final EventListener<TouchEvent> value);

	@JsProperty
	public abstract EventListener<Event> getOnwebkitfullscreenchange();

	@JsProperty
	public abstract void setOnwebkitfullscreenchange(final EventListener<Event> value);

	@JsProperty
	public abstract EventListener<Event> getOnwebkitfullscreenerror();

	@JsProperty
	public abstract void setOnwebkitfullscreenerror(final EventListener<Event> value);

	@JsProperty
	public abstract double getScrollHeight();

	@JsProperty
	public abstract void setScrollHeight(final double value);

	@JsProperty
	public abstract double getScrollLeft();

	@JsProperty
	public abstract void setScrollLeft(final double value);

	@JsProperty
	public abstract double getScrollTop();

	@JsProperty
	public abstract void setScrollTop(final double value);

	@JsProperty
	public abstract double getScrollWidth();

	@JsProperty
	public abstract void setScrollWidth(final double value);

	@JsProperty
	public abstract String getTagName();

	@JsProperty
	public abstract void setTagName(final String value);

	@JsProperty
	public abstract String getId();

	@JsProperty
	public abstract void setId(final String value);

	@JsProperty
	public abstract String getClassName();

	@JsProperty
	public abstract void setClassName(final String value);

	@JsMethod
	public abstract String getAttribute();

	@JsMethod
	public abstract String getAttribute(final String name);

	@JsMethod
	public abstract String getAttributeNS(final String namespaceURI, final String localName);

	@JsMethod
	public abstract Attr getAttributeNode(final String name);

	@JsMethod
	public abstract Attr getAttributeNodeNS(final String namespaceURI, final String localName);

	@JsMethod
	public abstract ClientRect getBoundingClientRect();

	@JsMethod
	public abstract ClientRectList getClientRects();

	@JsOverlay
	public default NodeListOf<HTMLAnchorElement> getElementsByTagNameA() {
		return (NodeListOf<HTMLAnchorElement>) getElementsByTagName("a");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameAbbr() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("abbr");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameAcronym() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("acronym");
	}

	@JsOverlay
	public default NodeListOf<HTMLBlockElement> getElementsByTagNameAddress() {
		return (NodeListOf<HTMLBlockElement>) getElementsByTagName("address");
	}

	@JsOverlay
	public default NodeListOf<HTMLAppletElement> getElementsByTagNameApplet() {
		return (NodeListOf<HTMLAppletElement>) getElementsByTagName("applet");
	}

	@JsOverlay
	public default NodeListOf<HTMLAreaElement> getElementsByTagNameArea() {
		return (NodeListOf<HTMLAreaElement>) getElementsByTagName("area");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameArticle() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("article");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameAside() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("aside");
	}

	@JsOverlay
	public default NodeListOf<HTMLAudioElement> getElementsByTagNameAudio() {
		return (NodeListOf<HTMLAudioElement>) getElementsByTagName("audio");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameB() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("b");
	}

	@JsOverlay
	public default NodeListOf<HTMLBaseElement> getElementsByTagNameBase() {
		return (NodeListOf<HTMLBaseElement>) getElementsByTagName("base");
	}

	@JsOverlay
	public default NodeListOf<HTMLBaseFontElement> getElementsByTagNameBasefont() {
		return (NodeListOf<HTMLBaseFontElement>) getElementsByTagName("basefont");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameBdo() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("bdo");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameBig() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("big");
	}

	@JsOverlay
	public default NodeListOf<HTMLBlockElement> getElementsByTagNameBlockquote() {
		return (NodeListOf<HTMLBlockElement>) getElementsByTagName("blockquote");
	}

	@JsOverlay
	public default NodeListOf<HTMLBodyElement> getElementsByTagNameBody() {
		return (NodeListOf<HTMLBodyElement>) getElementsByTagName("body");
	}

	@JsOverlay
	public default NodeListOf<HTMLBRElement> getElementsByTagNameBr() {
		return (NodeListOf<HTMLBRElement>) getElementsByTagName("br");
	}

	@JsOverlay
	public default NodeListOf<HTMLButtonElement> getElementsByTagNameButton() {
		return (NodeListOf<HTMLButtonElement>) getElementsByTagName("button");
	}

	@JsOverlay
	public default NodeListOf<HTMLCanvasElement> getElementsByTagNameCanvas() {
		return (NodeListOf<HTMLCanvasElement>) getElementsByTagName("canvas");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableCaptionElement> getElementsByTagNameCaption() {
		return (NodeListOf<HTMLTableCaptionElement>) getElementsByTagName("caption");
	}

	@JsOverlay
	public default NodeListOf<HTMLBlockElement> getElementsByTagNameCenter() {
		return (NodeListOf<HTMLBlockElement>) getElementsByTagName("center");
	}

	@JsOverlay
	public default NodeListOf<SVGCircleElement> getElementsByTagNameCircle() {
		return (NodeListOf<SVGCircleElement>) getElementsByTagName("circle");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameCite() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("cite");
	}

	@JsOverlay
	public default NodeListOf<SVGClipPathElement> getElementsByTagNameClippath() {
		return (NodeListOf<SVGClipPathElement>) getElementsByTagName("clippath");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameCode() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("code");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableColElement> getElementsByTagNameCol() {
		return (NodeListOf<HTMLTableColElement>) getElementsByTagName("col");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableColElement> getElementsByTagNameColgroup() {
		return (NodeListOf<HTMLTableColElement>) getElementsByTagName("colgroup");
	}

	@JsOverlay
	public default NodeListOf<HTMLDataListElement> getElementsByTagNameDatalist() {
		return (NodeListOf<HTMLDataListElement>) getElementsByTagName("datalist");
	}

	@JsOverlay
	public default NodeListOf<HTMLDDElement> getElementsByTagNameDd() {
		return (NodeListOf<HTMLDDElement>) getElementsByTagName("dd");
	}

	@JsOverlay
	public default NodeListOf<SVGDefsElement> getElementsByTagNameDefs() {
		return (NodeListOf<SVGDefsElement>) getElementsByTagName("defs");
	}

	@JsOverlay
	public default NodeListOf<HTMLModElement> getElementsByTagNameDel() {
		return (NodeListOf<HTMLModElement>) getElementsByTagName("del");
	}

	@JsOverlay
	public default NodeListOf<SVGDescElement> getElementsByTagNameDesc() {
		return (NodeListOf<SVGDescElement>) getElementsByTagName("desc");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameDfn() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("dfn");
	}

	@JsOverlay
	public default NodeListOf<HTMLDirectoryElement> getElementsByTagNameDir() {
		return (NodeListOf<HTMLDirectoryElement>) getElementsByTagName("dir");
	}

	@JsOverlay
	public default NodeListOf<HTMLDivElement> getElementsByTagNameDiv() {
		return (NodeListOf<HTMLDivElement>) getElementsByTagName("div");
	}

	@JsOverlay
	public default NodeListOf<HTMLDListElement> getElementsByTagNameDl() {
		return (NodeListOf<HTMLDListElement>) getElementsByTagName("dl");
	}

	@JsOverlay
	public default NodeListOf<HTMLDTElement> getElementsByTagNameDt() {
		return (NodeListOf<HTMLDTElement>) getElementsByTagName("dt");
	}

	@JsOverlay
	public default NodeListOf<SVGEllipseElement> getElementsByTagNameEllipse() {
		return (NodeListOf<SVGEllipseElement>) getElementsByTagName("ellipse");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameEm() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("em");
	}

	@JsOverlay
	public default NodeListOf<HTMLEmbedElement> getElementsByTagNameEmbed() {
		return (NodeListOf<HTMLEmbedElement>) getElementsByTagName("embed");
	}

	@JsOverlay
	public default NodeListOf<SVGFEBlendElement> getElementsByTagNameFeblend() {
		return (NodeListOf<SVGFEBlendElement>) getElementsByTagName("feblend");
	}

	@JsOverlay
	public default NodeListOf<SVGFEColorMatrixElement> getElementsByTagNameFecolormatrix() {
		return (NodeListOf<SVGFEColorMatrixElement>) getElementsByTagName("fecolormatrix");
	}

	@JsOverlay
	public default NodeListOf<SVGFEComponentTransferElement> getElementsByTagNameFecomponenttransfer() {
		return (NodeListOf<SVGFEComponentTransferElement>) getElementsByTagName("fecomponenttransfer");
	}

	@JsOverlay
	public default NodeListOf<SVGFECompositeElement> getElementsByTagNameFecomposite() {
		return (NodeListOf<SVGFECompositeElement>) getElementsByTagName("fecomposite");
	}

	@JsOverlay
	public default NodeListOf<SVGFEConvolveMatrixElement> getElementsByTagNameFeconvolvematrix() {
		return (NodeListOf<SVGFEConvolveMatrixElement>) getElementsByTagName("feconvolvematrix");
	}

	@JsOverlay
	public default NodeListOf<SVGFEDiffuseLightingElement> getElementsByTagNameFediffuselighting() {
		return (NodeListOf<SVGFEDiffuseLightingElement>) getElementsByTagName("fediffuselighting");
	}

	@JsOverlay
	public default NodeListOf<SVGFEDisplacementMapElement> getElementsByTagNameFedisplacementmap() {
		return (NodeListOf<SVGFEDisplacementMapElement>) getElementsByTagName("fedisplacementmap");
	}

	@JsOverlay
	public default NodeListOf<SVGFEDistantLightElement> getElementsByTagNameFedistantlight() {
		return (NodeListOf<SVGFEDistantLightElement>) getElementsByTagName("fedistantlight");
	}

	@JsOverlay
	public default NodeListOf<SVGFEFloodElement> getElementsByTagNameFeflood() {
		return (NodeListOf<SVGFEFloodElement>) getElementsByTagName("feflood");
	}

	@JsOverlay
	public default NodeListOf<SVGFEFuncAElement> getElementsByTagNameFefunca() {
		return (NodeListOf<SVGFEFuncAElement>) getElementsByTagName("fefunca");
	}

	@JsOverlay
	public default NodeListOf<SVGFEFuncBElement> getElementsByTagNameFefuncb() {
		return (NodeListOf<SVGFEFuncBElement>) getElementsByTagName("fefuncb");
	}

	@JsOverlay
	public default NodeListOf<SVGFEFuncGElement> getElementsByTagNameFefuncg() {
		return (NodeListOf<SVGFEFuncGElement>) getElementsByTagName("fefuncg");
	}

	@JsOverlay
	public default NodeListOf<SVGFEFuncRElement> getElementsByTagNameFefuncr() {
		return (NodeListOf<SVGFEFuncRElement>) getElementsByTagName("fefuncr");
	}

	@JsOverlay
	public default NodeListOf<SVGFEGaussianBlurElement> getElementsByTagNameFegaussianblur() {
		return (NodeListOf<SVGFEGaussianBlurElement>) getElementsByTagName("fegaussianblur");
	}

	@JsOverlay
	public default NodeListOf<SVGFEImageElement> getElementsByTagNameFeimage() {
		return (NodeListOf<SVGFEImageElement>) getElementsByTagName("feimage");
	}

	@JsOverlay
	public default NodeListOf<SVGFEMergeElement> getElementsByTagNameFemerge() {
		return (NodeListOf<SVGFEMergeElement>) getElementsByTagName("femerge");
	}

	@JsOverlay
	public default NodeListOf<SVGFEMergeNodeElement> getElementsByTagNameFemergenode() {
		return (NodeListOf<SVGFEMergeNodeElement>) getElementsByTagName("femergenode");
	}

	@JsOverlay
	public default NodeListOf<SVGFEMorphologyElement> getElementsByTagNameFemorphology() {
		return (NodeListOf<SVGFEMorphologyElement>) getElementsByTagName("femorphology");
	}

	@JsOverlay
	public default NodeListOf<SVGFEOffsetElement> getElementsByTagNameFeoffset() {
		return (NodeListOf<SVGFEOffsetElement>) getElementsByTagName("feoffset");
	}

	@JsOverlay
	public default NodeListOf<SVGFEPointLightElement> getElementsByTagNameFepointlight() {
		return (NodeListOf<SVGFEPointLightElement>) getElementsByTagName("fepointlight");
	}

	@JsOverlay
	public default NodeListOf<SVGFESpecularLightingElement> getElementsByTagNameFespecularlighting() {
		return (NodeListOf<SVGFESpecularLightingElement>) getElementsByTagName("fespecularlighting");
	}

	@JsOverlay
	public default NodeListOf<SVGFESpotLightElement> getElementsByTagNameFespotlight() {
		return (NodeListOf<SVGFESpotLightElement>) getElementsByTagName("fespotlight");
	}

	@JsOverlay
	public default NodeListOf<SVGFETileElement> getElementsByTagNameFetile() {
		return (NodeListOf<SVGFETileElement>) getElementsByTagName("fetile");
	}

	@JsOverlay
	public default NodeListOf<SVGFETurbulenceElement> getElementsByTagNameFeturbulence() {
		return (NodeListOf<SVGFETurbulenceElement>) getElementsByTagName("feturbulence");
	}

	@JsOverlay
	public default NodeListOf<HTMLFieldSetElement> getElementsByTagNameFieldset() {
		return (NodeListOf<HTMLFieldSetElement>) getElementsByTagName("fieldset");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameFigcaption() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("figcaption");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameFigure() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("figure");
	}

	@JsOverlay
	public default NodeListOf<SVGFilterElement> getElementsByTagNameFilter() {
		return (NodeListOf<SVGFilterElement>) getElementsByTagName("filter");
	}

	@JsOverlay
	public default NodeListOf<HTMLFontElement> getElementsByTagNameFont() {
		return (NodeListOf<HTMLFontElement>) getElementsByTagName("font");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameFooter() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("footer");
	}

	@JsOverlay
	public default NodeListOf<SVGForeignObjectElement> getElementsByTagNameForeignobject() {
		return (NodeListOf<SVGForeignObjectElement>) getElementsByTagName("foreignobject");
	}

	@JsOverlay
	public default NodeListOf<HTMLFormElement> getElementsByTagNameForm() {
		return (NodeListOf<HTMLFormElement>) getElementsByTagName("form");
	}

	@JsOverlay
	public default NodeListOf<HTMLFrameElement> getElementsByTagNameFrame() {
		return (NodeListOf<HTMLFrameElement>) getElementsByTagName("frame");
	}

	@JsOverlay
	public default NodeListOf<HTMLFrameSetElement> getElementsByTagNameFrameset() {
		return (NodeListOf<HTMLFrameSetElement>) getElementsByTagName("frameset");
	}

	@JsOverlay
	public default NodeListOf<SVGGElement> getElementsByTagNameG() {
		return (NodeListOf<SVGGElement>) getElementsByTagName("g");
	}

	@JsOverlay
	public default NodeListOf<HTMLHeadingElement> getElementsByTagNameH1() {
		return (NodeListOf<HTMLHeadingElement>) getElementsByTagName("h1");
	}

	@JsOverlay
	public default NodeListOf<HTMLHeadingElement> getElementsByTagNameH2() {
		return (NodeListOf<HTMLHeadingElement>) getElementsByTagName("h2");
	}

	@JsOverlay
	public default NodeListOf<HTMLHeadingElement> getElementsByTagNameH3() {
		return (NodeListOf<HTMLHeadingElement>) getElementsByTagName("h3");
	}

	@JsOverlay
	public default NodeListOf<HTMLHeadingElement> getElementsByTagNameH4() {
		return (NodeListOf<HTMLHeadingElement>) getElementsByTagName("h4");
	}

	@JsOverlay
	public default NodeListOf<HTMLHeadingElement> getElementsByTagNameH5() {
		return (NodeListOf<HTMLHeadingElement>) getElementsByTagName("h5");
	}

	@JsOverlay
	public default NodeListOf<HTMLHeadingElement> getElementsByTagNameH6() {
		return (NodeListOf<HTMLHeadingElement>) getElementsByTagName("h6");
	}

	@JsOverlay
	public default NodeListOf<HTMLHeadElement> getElementsByTagNameHead() {
		return (NodeListOf<HTMLHeadElement>) getElementsByTagName("head");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameHeader() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("header");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameHgroup() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("hgroup");
	}

	@JsOverlay
	public default NodeListOf<HTMLHRElement> getElementsByTagNameHr() {
		return (NodeListOf<HTMLHRElement>) getElementsByTagName("hr");
	}

	@JsOverlay
	public default NodeListOf<HTMLHtmlElement> getElementsByTagNameHtml() {
		return (NodeListOf<HTMLHtmlElement>) getElementsByTagName("html");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameI() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("i");
	}

	@JsOverlay
	public default NodeListOf<HTMLIFrameElement> getElementsByTagNameIframe() {
		return (NodeListOf<HTMLIFrameElement>) getElementsByTagName("iframe");
	}

	@JsOverlay
	public default NodeListOf<SVGImageElement> getElementsByTagNameImage() {
		return (NodeListOf<SVGImageElement>) getElementsByTagName("image");
	}

	@JsOverlay
	public default NodeListOf<HTMLImageElement> getElementsByTagNameImg() {
		return (NodeListOf<HTMLImageElement>) getElementsByTagName("img");
	}

	@JsOverlay
	public default NodeListOf<HTMLInputElement> getElementsByTagNameInput() {
		return (NodeListOf<HTMLInputElement>) getElementsByTagName("input");
	}

	@JsOverlay
	public default NodeListOf<HTMLModElement> getElementsByTagNameIns() {
		return (NodeListOf<HTMLModElement>) getElementsByTagName("ins");
	}

	@JsOverlay
	public default NodeListOf<HTMLIsIndexElement> getElementsByTagNameIsindex() {
		return (NodeListOf<HTMLIsIndexElement>) getElementsByTagName("isindex");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameKbd() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("kbd");
	}

	@JsOverlay
	public default NodeListOf<HTMLBlockElement> getElementsByTagNameKeygen() {
		return (NodeListOf<HTMLBlockElement>) getElementsByTagName("keygen");
	}

	@JsOverlay
	public default NodeListOf<HTMLLabelElement> getElementsByTagNameLabel() {
		return (NodeListOf<HTMLLabelElement>) getElementsByTagName("label");
	}

	@JsOverlay
	public default NodeListOf<HTMLLegendElement> getElementsByTagNameLegend() {
		return (NodeListOf<HTMLLegendElement>) getElementsByTagName("legend");
	}

	@JsOverlay
	public default NodeListOf<HTMLLIElement> getElementsByTagNameLi() {
		return (NodeListOf<HTMLLIElement>) getElementsByTagName("li");
	}

	@JsOverlay
	public default NodeListOf<SVGLineElement> getElementsByTagNameLine() {
		return (NodeListOf<SVGLineElement>) getElementsByTagName("line");
	}

	@JsOverlay
	public default NodeListOf<SVGLinearGradientElement> getElementsByTagNameLineargradient() {
		return (NodeListOf<SVGLinearGradientElement>) getElementsByTagName("lineargradient");
	}

	@JsOverlay
	public default NodeListOf<HTMLLinkElement> getElementsByTagNameLink() {
		return (NodeListOf<HTMLLinkElement>) getElementsByTagName("link");
	}

	@JsOverlay
	public default NodeListOf<HTMLBlockElement> getElementsByTagNameListing() {
		return (NodeListOf<HTMLBlockElement>) getElementsByTagName("listing");
	}

	@JsOverlay
	public default NodeListOf<HTMLMapElement> getElementsByTagNameMap() {
		return (NodeListOf<HTMLMapElement>) getElementsByTagName("map");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameMark() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("mark");
	}

	@JsOverlay
	public default NodeListOf<SVGMarkerElement> getElementsByTagNameMarker() {
		return (NodeListOf<SVGMarkerElement>) getElementsByTagName("marker");
	}

	@JsOverlay
	public default NodeListOf<HTMLMarqueeElement> getElementsByTagNameMarquee() {
		return (NodeListOf<HTMLMarqueeElement>) getElementsByTagName("marquee");
	}

	@JsOverlay
	public default NodeListOf<SVGMaskElement> getElementsByTagNameMask() {
		return (NodeListOf<SVGMaskElement>) getElementsByTagName("mask");
	}

	@JsOverlay
	public default NodeListOf<HTMLMenuElement> getElementsByTagNameMenu() {
		return (NodeListOf<HTMLMenuElement>) getElementsByTagName("menu");
	}

	@JsOverlay
	public default NodeListOf<HTMLMetaElement> getElementsByTagNameMeta() {
		return (NodeListOf<HTMLMetaElement>) getElementsByTagName("meta");
	}

	@JsOverlay
	public default NodeListOf<SVGMetadataElement> getElementsByTagNameMetadata() {
		return (NodeListOf<SVGMetadataElement>) getElementsByTagName("metadata");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameNav() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("nav");
	}

	@JsOverlay
	public default NodeListOf<HTMLNextIdElement> getElementsByTagNameNextid() {
		return (NodeListOf<HTMLNextIdElement>) getElementsByTagName("nextid");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameNobr() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("nobr");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameNoframes() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("noframes");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameNoscript() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("noscript");
	}

	@JsOverlay
	public default NodeListOf<HTMLObjectElement> getElementsByTagNameObject() {
		return (NodeListOf<HTMLObjectElement>) getElementsByTagName("object");
	}

	@JsOverlay
	public default NodeListOf<HTMLOListElement> getElementsByTagNameOl() {
		return (NodeListOf<HTMLOListElement>) getElementsByTagName("ol");
	}

	@JsOverlay
	public default NodeListOf<HTMLOptGroupElement> getElementsByTagNameOptgroup() {
		return (NodeListOf<HTMLOptGroupElement>) getElementsByTagName("optgroup");
	}

	@JsOverlay
	public default NodeListOf<HTMLOptionElement> getElementsByTagNameOption() {
		return (NodeListOf<HTMLOptionElement>) getElementsByTagName("option");
	}

	@JsOverlay
	public default NodeListOf<HTMLParagraphElement> getElementsByTagNameP() {
		return (NodeListOf<HTMLParagraphElement>) getElementsByTagName("p");
	}

	@JsOverlay
	public default NodeListOf<HTMLParamElement> getElementsByTagNameParam() {
		return (NodeListOf<HTMLParamElement>) getElementsByTagName("param");
	}

	@JsOverlay
	public default NodeListOf<SVGPathElement> getElementsByTagNamePath() {
		return (NodeListOf<SVGPathElement>) getElementsByTagName("path");
	}

	@JsOverlay
	public default NodeListOf<SVGPatternElement> getElementsByTagNamePattern() {
		return (NodeListOf<SVGPatternElement>) getElementsByTagName("pattern");
	}

	@JsOverlay
	public default NodeListOf<HTMLBlockElement> getElementsByTagNamePlaintext() {
		return (NodeListOf<HTMLBlockElement>) getElementsByTagName("plaintext");
	}

	@JsOverlay
	public default NodeListOf<SVGPolygonElement> getElementsByTagNamePolygon() {
		return (NodeListOf<SVGPolygonElement>) getElementsByTagName("polygon");
	}

	@JsOverlay
	public default NodeListOf<SVGPolylineElement> getElementsByTagNamePolyline() {
		return (NodeListOf<SVGPolylineElement>) getElementsByTagName("polyline");
	}

	@JsOverlay
	public default NodeListOf<HTMLPreElement> getElementsByTagNamePre() {
		return (NodeListOf<HTMLPreElement>) getElementsByTagName("pre");
	}

	@JsOverlay
	public default NodeListOf<HTMLProgressElement> getElementsByTagNameProgress() {
		return (NodeListOf<HTMLProgressElement>) getElementsByTagName("progress");
	}

	@JsOverlay
	public default NodeListOf<HTMLQuoteElement> getElementsByTagNameQ() {
		return (NodeListOf<HTMLQuoteElement>) getElementsByTagName("q");
	}

	@JsOverlay
	public default NodeListOf<SVGRadialGradientElement> getElementsByTagNameRadialgradient() {
		return (NodeListOf<SVGRadialGradientElement>) getElementsByTagName("radialgradient");
	}

	@JsOverlay
	public default NodeListOf<SVGRectElement> getElementsByTagNameRect() {
		return (NodeListOf<SVGRectElement>) getElementsByTagName("rect");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameRt() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("rt");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameRuby() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("ruby");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameS() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("s");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameSamp() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("samp");
	}

	@JsOverlay
	public default NodeListOf<HTMLScriptElement> getElementsByTagNameScript() {
		return (NodeListOf<HTMLScriptElement>) getElementsByTagName("script");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameSection() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("section");
	}

	@JsOverlay
	public default NodeListOf<HTMLSelectElement> getElementsByTagNameSelect() {
		return (NodeListOf<HTMLSelectElement>) getElementsByTagName("select");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameSmall() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("small");
	}

	@JsOverlay
	public default NodeListOf<HTMLSourceElement> getElementsByTagNameSource() {
		return (NodeListOf<HTMLSourceElement>) getElementsByTagName("source");
	}

	@JsOverlay
	public default NodeListOf<HTMLSpanElement> getElementsByTagNameSpan() {
		return (NodeListOf<HTMLSpanElement>) getElementsByTagName("span");
	}

	@JsOverlay
	public default NodeListOf<SVGStopElement> getElementsByTagNameStop() {
		return (NodeListOf<SVGStopElement>) getElementsByTagName("stop");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameStrike() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("strike");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameStrong() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("strong");
	}

	@JsOverlay
	public default NodeListOf<HTMLStyleElement> getElementsByTagNameStyle() {
		return (NodeListOf<HTMLStyleElement>) getElementsByTagName("style");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameSub() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("sub");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameSup() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("sup");
	}

	@JsOverlay
	public default NodeListOf<SVGSVGElement> getElementsByTagNameSvg() {
		return (NodeListOf<SVGSVGElement>) getElementsByTagName("svg");
	}

	@JsOverlay
	public default NodeListOf<SVGSwitchElement> getElementsByTagNameSwitch() {
		return (NodeListOf<SVGSwitchElement>) getElementsByTagName("switch");
	}

	@JsOverlay
	public default NodeListOf<SVGSymbolElement> getElementsByTagNameSymbol() {
		return (NodeListOf<SVGSymbolElement>) getElementsByTagName("symbol");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableElement> getElementsByTagNameTable() {
		return (NodeListOf<HTMLTableElement>) getElementsByTagName("table");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableSectionElement> getElementsByTagNameTbody() {
		return (NodeListOf<HTMLTableSectionElement>) getElementsByTagName("tbody");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableDataCellElement> getElementsByTagNameTd() {
		return (NodeListOf<HTMLTableDataCellElement>) getElementsByTagName("td");
	}

	@JsOverlay
	public default NodeListOf<SVGTextElement> getElementsByTagNameText() {
		return (NodeListOf<SVGTextElement>) getElementsByTagName("text");
	}

	@JsOverlay
	public default NodeListOf<SVGTextPathElement> getElementsByTagNameTextpath() {
		return (NodeListOf<SVGTextPathElement>) getElementsByTagName("textpath");
	}

	@JsOverlay
	public default NodeListOf<HTMLTextAreaElement> getElementsByTagNameTextarea() {
		return (NodeListOf<HTMLTextAreaElement>) getElementsByTagName("textarea");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableSectionElement> getElementsByTagNameTfoot() {
		return (NodeListOf<HTMLTableSectionElement>) getElementsByTagName("tfoot");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableHeaderCellElement> getElementsByTagNameTh() {
		return (NodeListOf<HTMLTableHeaderCellElement>) getElementsByTagName("th");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableSectionElement> getElementsByTagNameThead() {
		return (NodeListOf<HTMLTableSectionElement>) getElementsByTagName("thead");
	}

	@JsOverlay
	public default NodeListOf<HTMLTitleElement> getElementsByTagNameTitle() {
		return (NodeListOf<HTMLTitleElement>) getElementsByTagName("title");
	}

	@JsOverlay
	public default NodeListOf<HTMLTableRowElement> getElementsByTagNameTr() {
		return (NodeListOf<HTMLTableRowElement>) getElementsByTagName("tr");
	}

	@JsOverlay
	public default NodeListOf<HTMLTrackElement> getElementsByTagNameTrack() {
		return (NodeListOf<HTMLTrackElement>) getElementsByTagName("track");
	}

	@JsOverlay
	public default NodeListOf<SVGTSpanElement> getElementsByTagNameTspan() {
		return (NodeListOf<SVGTSpanElement>) getElementsByTagName("tspan");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameTt() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("tt");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameU() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("u");
	}

	@JsOverlay
	public default NodeListOf<HTMLUListElement> getElementsByTagNameUl() {
		return (NodeListOf<HTMLUListElement>) getElementsByTagName("ul");
	}

	@JsOverlay
	public default NodeListOf<SVGUseElement> getElementsByTagNameUse() {
		return (NodeListOf<SVGUseElement>) getElementsByTagName("use");
	}

	@JsOverlay
	public default NodeListOf<HTMLPhraseElement> getElementsByTagNameVar() {
		return (NodeListOf<HTMLPhraseElement>) getElementsByTagName("var");
	}

	@JsOverlay
	public default NodeListOf<HTMLVideoElement> getElementsByTagNameVideo() {
		return (NodeListOf<HTMLVideoElement>) getElementsByTagName("video");
	}

	@JsOverlay
	public default NodeListOf<SVGViewElement> getElementsByTagNameView() {
		return (NodeListOf<SVGViewElement>) getElementsByTagName("view");
	}

	@JsOverlay
	public default NodeListOf<HTMLElement> getElementsByTagNameWbr() {
		return (NodeListOf<HTMLElement>) getElementsByTagName("wbr");
	}

	@JsOverlay
	public default NodeListOf<MSHTMLWebViewElement> getElementsByTagNameXMsWebview() {
		return (NodeListOf<MSHTMLWebViewElement>) getElementsByTagName("x-ms-webview");
	}

	@JsOverlay
	public default NodeListOf<HTMLBlockElement> getElementsByTagNameXmp() {
		return (NodeListOf<HTMLBlockElement>) getElementsByTagName("xmp");
	}

	@JsMethod
	public abstract NodeListOf<? extends Element> getElementsByTagName(final String name);

	@JsMethod
	public abstract NodeListOf<? extends Element> getElementsByTagNameNS(final String namespaceURI,
			final String localName);

	@JsMethod
	public abstract boolean hasAttribute(final String name);

	@JsMethod
	public abstract boolean hasAttributeNS(final String namespaceURI, final String localName);

	@JsMethod
	public abstract MSRangeCollection msGetRegionContent();

	@JsMethod
	public abstract ClientRect msGetUntransformedBounds();

	@JsMethod
	public abstract boolean msMatchesSelector(final String selectors);

	@JsMethod
	public abstract void msReleasePointerCapture(final double pointerId);

	@JsMethod
	public abstract void msSetPointerCapture(final double pointerId);

	@JsMethod
	public abstract void msZoomTo(final MsZoomToOptions args);

	@JsMethod
	public abstract void releasePointerCapture(final double pointerId);

	@JsMethod
	public abstract void removeAttribute();

	@JsMethod
	public abstract void removeAttribute(final String name);

	@JsMethod
	public abstract void removeAttributeNS(final String namespaceURI, final String localName);

	@JsMethod
	public abstract Attr removeAttributeNode(final Attr oldAttr);

	@JsMethod
	public abstract void requestFullscreen();

	@JsMethod
	public abstract void requestPointerLock();

	@JsMethod
	public abstract void setAttribute();

	@JsMethod
	public abstract void setAttribute(final String name);

	@JsMethod
	public abstract void setAttribute(final String name, final String value);

	@JsMethod
	public abstract void setAttributeNS(final String namespaceURI, final String qualifiedName, final String value);

	@JsMethod
	public abstract Attr setAttributeNode(final Attr newAttr);

	@JsMethod
	public abstract Attr setAttributeNodeNS(final Attr newAttr);

	@JsMethod
	public abstract void setPointerCapture(final double pointerId);

	@JsMethod
	public abstract boolean webkitMatchesSelector(final String selectors);

	@JsMethod
	public abstract void webkitRequestFullScreen();

	@JsMethod
	public abstract void webkitRequestFullscreen();

	@JsMethod
	public abstract NodeListOf<Element> getElementsByClassName(final String classNames);

	@JsMethod
	public abstract boolean matches(final String selector);

	@JsOverlay
	public default void addEventListenerMSGestureChange(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureChange", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureChange(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureChange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureDoubleTap(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureDoubleTap", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureDoubleTap(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureDoubleTap", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureEnd(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureEnd", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureEnd(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureEnd", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureHold(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureHold", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureHold(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureHold", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureStart(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureStart", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureStart(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureStart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureTap(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureTap", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureTap(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureTap", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGotPointerCapture(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSGotPointerCapture", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGotPointerCapture(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSGotPointerCapture", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSInertiaStart(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSInertiaStart", listener);
	}

	@JsOverlay
	public default void addEventListenerMSInertiaStart(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSInertiaStart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSLostPointerCapture(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSLostPointerCapture", listener);
	}

	@JsOverlay
	public default void addEventListenerMSLostPointerCapture(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSLostPointerCapture", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerCancel(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerCancel", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerCancel(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerCancel", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerDown(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerDown", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerDown(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerDown", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerEnter(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerEnter", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerEnter(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerEnter", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerLeave(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerLeave", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerLeave(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerLeave", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerMove(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerMove", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerMove(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerMove", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOut(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerOut", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOut(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerOut", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOver(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerOver", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOver(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerOver", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerUp(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerUp", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerUp(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerUp", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerAriarequest(final EventListener<AriaRequestEvent> listener) {
		addEventListener("ariarequest", listener);
	}

	@JsOverlay
	public default void addEventListenerAriarequest(final EventListener<AriaRequestEvent> listener, final boolean useCapture) {
		addEventListener("ariarequest", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerCommand(final EventListener<CommandEvent> listener) {
		addEventListener("command", listener);
	}

	@JsOverlay
	public default void addEventListenerCommand(final EventListener<CommandEvent> listener, final boolean useCapture) {
		addEventListener("command", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerGotpointercapture(final EventListener<PointerEvent> listener) {
		addEventListener("gotpointercapture", listener);
	}

	@JsOverlay
	public default void addEventListenerGotpointercapture(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("gotpointercapture", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLostpointercapture(final EventListener<PointerEvent> listener) {
		addEventListener("lostpointercapture", listener);
	}

	@JsOverlay
	public default void addEventListenerLostpointercapture(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("lostpointercapture", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointercancel(final EventListener<PointerEvent> listener) {
		addEventListener("pointercancel", listener);
	}

	@JsOverlay
	public default void addEventListenerPointercancel(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointercancel", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerdown(final EventListener<PointerEvent> listener) {
		addEventListener("pointerdown", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerdown(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerdown", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerenter(final EventListener<PointerEvent> listener) {
		addEventListener("pointerenter", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerenter(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerenter", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerleave(final EventListener<PointerEvent> listener) {
		addEventListener("pointerleave", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerleave(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerleave", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointermove(final EventListener<PointerEvent> listener) {
		addEventListener("pointermove", listener);
	}

	@JsOverlay
	public default void addEventListenerPointermove(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointermove", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerout(final EventListener<PointerEvent> listener) {
		addEventListener("pointerout", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerout(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerout", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerover(final EventListener<PointerEvent> listener) {
		addEventListener("pointerover", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerover(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerover", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerup(final EventListener<PointerEvent> listener) {
		addEventListener("pointerup", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerup(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerup", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchcancel(final EventListener<TouchEvent> listener) {
		addEventListener("touchcancel", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchcancel(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchcancel", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchend(final EventListener<TouchEvent> listener) {
		addEventListener("touchend", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchend(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchend", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchmove(final EventListener<TouchEvent> listener) {
		addEventListener("touchmove", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchmove(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchmove", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchstart(final EventListener<TouchEvent> listener) {
		addEventListener("touchstart", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchstart(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchstart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenchange(final EventListener<Event> listener) {
		addEventListener("webkitfullscreenchange", listener);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenchange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("webkitfullscreenchange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenerror(final EventListener<Event> listener) {
		addEventListener("webkitfullscreenerror", listener);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenerror(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("webkitfullscreenerror", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerWheel(final EventListener<WheelEvent> listener) {
		addEventListener("wheel", listener);
	}

	@JsOverlay
	public default void addEventListenerWheel(final EventListener<WheelEvent> listener, final boolean useCapture) {
		addEventListener("wheel", listener, useCapture);
	}

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener, final boolean useCapture);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener,
			final boolean useCapture);
}
