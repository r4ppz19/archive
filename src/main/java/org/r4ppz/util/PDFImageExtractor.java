package org.r4ppz.util;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import java.awt.image.BufferedImage;

public class PDFImageExtractor {
    
    public BufferedImage imageExtractor(String pdfFileName) {
        BufferedImage image = null;
        try (PDDocument document = PDDocument.load(new File(pdfFileName))) {
            PDFRenderer renderer = new PDFRenderer(document);
            
            for (int page = 0; page < document.getNumberOfPages(); page++) {
                image = renderer. renderImageWithDPI(page, 300);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;

    }
}
