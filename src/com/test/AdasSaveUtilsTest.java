package com.test;


public class AdasSaveUtilsTest {

//    public static void main(String[] args) {
//
//        /*String str = "0x30 0x31 0x63 0x64 0x30 0x30 0x5F 0x36 0x35 0x5F 0x36 0x35 0x30 0x35 0x5F 0x30 0x30 0x5F 0x42 0x41 0xFC 0xF4 0x2E 0x73 0x4B 0x9C 0xBC 0xF1 0x24 0xF5 0xDC 0x8D 0x2F 0x44 0x42 0x41 0xFC 0xF4 0x2E 0x73 0x4B 0x9C 0xBC 0xF1 0x24 0xF5 0xDC 0x8D 0x2F 0x44 0x2E 0x6A 0x70 0x67 0x00 0x00 0x00 0x00 0x00 0x00 0x3B 0xA4 0xFF 0xD8 0xFF 0xE0 0x00 0x10 0x4A 0x46 0x49 0x46 0x00 0x01 0x01 0x00 0x00 0x01 0x00 0x01 0x00 0x00 0xFF 0xDB 0x00 0xC5 0x00 0x03 0x02 0x02 0x03 0x02 0x02 0x03 0x03 0x03 0x03 0x04 0x03 0x03 0x04 0x05 0x08 0x05 0x05 0x04 0x04 0x05 0x0A 0x07 0x07 0x06 0x08 0x0C 0x0A 0x0C 0x0C 0x0B 0x0A 0x0B 0x0B 0x0D 0x0E 0x12 0x10 0x0D 0x0E 0x11 0x0E 0x0B 0x0B 0x10 0x16 0x10 0x11 0x13 0x14 0x15 0x15 0x15 0x0C 0x0F 0x17 0x18 0x16 0x14 0x18 0x12 0x14 0x15 0x14 0x01 0x03 0x04 0x04 0x05 0x04 0x05 0x09 0x05 0x05 0x09 0x14 0x0D 0x0B 0x0D 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x02 0x03 0x04 0x04 0x05 0x04 0x05 0x09 0x05 0x05 0x09 0x14 0x0D 0x0B 0x0D 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0x14 0xFF 0xC0 0x00 0x11 0x08 0x01 0x20 0x01 0x60 0x03 0x01 0x22 0x00 0x02 0x11 0x01 0x03 0x11 0x02 0xFF 0xC4 0x01 0xA2 0x00 0x00 0x01 0x05 0x01 0x01 0x01 0x01 0x01 0x01 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x00 0x01 0x02 0x03 0x04 0x05 0x06 0x07 0x08 0x09 0x0A 0x0B 0x10 0x00 0x02 0x01 0x03 0x03 0x02 0x04 0x03 0x05 0x05 0x04 0x04 0x00 0x00 0x01 0x7D 0x01 0x02 0x03 0x00 0x04 0x11 0x05 0x12 0x21 0x31 0x41 0x06 0x13 0x51 0x61 0x07 0x22 0x71 0x14 0x32 0x81 0x91 0xA1 0x08 0x23 0x42 0xB1 0xC1 0x15 0x52 0xD1 0xF0 0x24 0x33 0x62 0x72 0x82 0x09 0x0A 0x16 0x17 0x18 0x19 0x1A 0x25 0x26 0x27 0x28 0x29 0x2A 0x34 0x35 0x36 0x37 0x38 0x39 0x3A 0x43 0x44 0x45 0x46 0x47 0x48 0x49 0x4A 0x53 0x54 0x55 0x56 0x57 0x58 0x59 0x5A 0x63 0x64 0x65 0x66 0x67 0x68 0x69 0x6A 0x73 0x74 0x75 0x76 0x77 0x78 0x79 0x7A 0x83 0x84 0x85 0x86 0x87 0x88 0x89 0x8A 0x92 0x93 0x94 0x95 0x96 0x97 0x98 0x99 0x9A 0xA2 0xA3 0xA4 0xA5 0xA6 0xA7 0xA8 0xA9 0xAA 0xB2 0xB3 0xB4 0xB5 0xB6 0xB7 0xB8 0xB9 0xBA 0xC2 0xC3 0xC4 0xC5 0xC6 0xC7 0xC8 0xC9 0xCA 0xD2 0xD3 0xD4 0xD5 0xD6 0xD7 0xD8 0xD9 0xDA 0xE1 0xE2 0xE3 0xE4 0xE5 0xE6 0xE7 0xE8 0xE9 0xEA 0xF1 0xF2 0xF3 0xF4 0xF5 0xF6 0xF7 0xF8 0xF9 0xFA";
//
//        String[] s = str.split(" ");
//
//        byte[] bytes = new byte[1024];
//        for (int i=0;i<s.length;i++){
//            bytes[i] = (byte)s[i];
//        }*/
//
//        /*byte[] bytes = new byte[]{
//            0x30,0x31,0x63,0x64,0x30,0x30,0x5F,0x36,0x35,0x5F,0x36,0x35,0x30,0x35,0x5F,0x30,0x30,0x5F,0x42,0x41,(byte)0xFC,(byte)0xF4,0x2E,0x73,0x4B,(byte)0x9C,(byte)0xBC,(byte)0xF1,0x24,(byte)0xF5,(byte)0xDC,(byte)0x8D,0x2F,0x44,0x42,0x41,(byte)0xFC,(byte)0xF4,0x2E,0x73,0x4B,(byte)0x9C,(byte)0xBC,(byte)0xF1,0x24,(byte)0xF5,(byte)0xDC,(byte)0x8D,0x2F,0x44,0x2E,0x6A,0x70,0x67,0x00,0x00,0x00,0x00,0x00,0x00,0x3B,(byte)0xA4,(byte)0xFF,(byte)0xD8,(byte)0xFF,(byte)0xE0,0x00,0x10,0x4A,0x46,0x49,0x46,0x00,0x01,0x01,0x00,0x00,0x01,0x00,0x01,0x00,0x00,(byte)0xFF,(byte)0xDB,0x00,(byte)0xC5,0x00,0x03,0x02,0x02,0x03,0x02,0x02,0x03,0x03,0x03,0x03,0x04,0x03,0x03,0x04,0x05,0x08,0x05,0x05,0x04,0x04,0x05,0x0A,0x07,0x07,0x06,0x08,0x0C,0x0A,0x0C,0x0C,0x0B,0x0A,0x0B,0x0B,0x0D,0x0E,0x12,0x10,0x0D,0x0E,0x11,0x0E,0x0B,0x0B,0x10,0x16,0x10,0x11,0x13,0x14,0x15,0x15,0x15,0x0C,0x0F,0x17,0x18,0x16,0x14,0x18,0x12,0x14,0x15,0x14,0x01,0x03,0x04,0x04,0x05,0x04,0x05,0x09,0x05,0x05,0x09,0x14,0x0D,0x0B,0x0D,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x02,0x03,0x04,0x04,0x05,0x04,0x05,0x09,0x05,0x05,0x09,0x14,0x0D,0x0B,0x0D,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,0x14,(byte)0xFF,(byte)0xC0,0x00,0x11,0x08,0x01,0x20,0x01,0x60,0x03,0x01,0x22,0x00,0x02,0x11,0x01,0x03,0x11,0x02,(byte)0xFF,(byte)0xC4,0x01,(byte)0xA2,0x00,0x00,0x01,0x05,0x01,0x01,0x01,0x01,0x01,0x01,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x01,0x02,0x03,0x04,0x05,0x06,0x07,0x08,0x09,0x0A,0x0B,0x10,0x00,0x02,0x01,0x03,0x03,0x02,0x04,0x03,0x05,0x05,0x04,0x04,0x00,0x00,0x01,0x7D,0x01,0x02,0x03,0x00,0x04,0x11,0x05,0x12,0x21,0x31,0x41,0x06,0x13,0x51,0x61,0x07,0x22,0x71,0x14,0x32,(byte)0x81,(byte)0x91,(byte)0xA1,0x08,0x23,0x42,(byte)0xB1,(byte)0xC1,0x15,0x52,(byte)0xD1,(byte)0xF0,0x24,0x33,0x62,0x72,(byte)0x82,0x09,0x0A,0x16,0x17,0x18,0x19,0x1A,0x25,0x26,0x27,0x28,0x29,0x2A,0x34,0x35,0x36,0x37,0x38,0x39,0x3A,0x43,0x44,0x45,0x46,0x47,0x48,0x49,0x4A,0x53,0x54,0x55,0x56,0x57,0x58,0x59,0x5A,0x63,0x64,0x65,0x66,0x67,0x68,0x69,0x6A,0x73,0x74,0x75,0x76,0x77,0x78,0x79,0x7A,(byte)0x83,(byte)0x84,(byte)0x85,(byte)0x86,(byte)0x87,(byte)0x88,(byte)0x89,(byte)0x8A,(byte)0x92,(byte)0x93,(byte)0x94,(byte)0x95,(byte)0x96,(byte)0x97,(byte)0x98,(byte)0x99,(byte)0x9A,(byte)0xA2,(byte)0xA3,(byte)0xA4,(byte)0xA5,(byte)0xA6,(byte)0xA7,(byte)0xA8,(byte)0xA9,(byte)0xAA,(byte)0xB2,(byte)0xB3,(byte)0xB4,(byte)0xB5,(byte)0xB6,(byte)0xB7,(byte)0xB8,(byte)0xB9,(byte)0xBA,(byte)0xC2,(byte)0xC3,(byte)0xC4,(byte)0xC5,(byte)0xC6,(byte)0xC7,(byte)0xC8,(byte)0xC9,(byte)0xCA,(byte)0xD2,(byte)0xD3,(byte)0xD4,(byte)0xD5,(byte)0xD6,(byte)0xD7,(byte)0xD8,(byte)0xD9,(byte)0xDA,(byte)0xE1,(byte)0xE2,(byte)0xE3,(byte)0xE4,(byte)0xE5,(byte)0xE6,(byte)0xE7,(byte)0xE8,(byte)0xE9,(byte)0xEA,(byte)0xF1,(byte)0xF2,(byte)0xF3,(byte)0xF4,(byte)0xF5,(byte)0xF6,(byte)0xF7,(byte)0xF8,(byte)0xF9,(byte)0xFA};
//
//
//        Packet packet = Packet.create(bytes);
//
//        //System.arraycopy(s,0, packet.data,0,s.length);
//
//
//        AdasSaveUtils.addDataToFile(packet);*/
//        byte[] bytes = new byte[]{
//                0x7E,0x12,0x11,0x00,0x38,0x01,0x29,0x17,0x00,0x05,0x28,0x0E,0x4A,0x32,0x30,0x30,0x5F,0x36,0x35,0x5F,0x36,0x35,0x30,0x35,0x5F,0x30,0x30,0x5F,0x42,0x41,0xFC,0xF4,0x2E,0x73,0x4B,(byte)0x9C,(byte)0xBC,(byte)0xF1,0x24, (byte) 0xF5,(byte)0xDC,(byte)0x8D,0x2F,0x44,0x42,0x41,(byte)0xFC,(byte)0xF4,0x2E,0x73,0x4B,(byte)0x9C,(byte)0xBC,(byte)0xF1,0x24,(byte)0xF5,(byte)0xDC,(byte)0x8D,0x2F,0x44,0x2E,0x6A,0x70,0x67,0x00,0x00,0x00,0x3B,(byte)0xA4,(byte)0x96,0x7E};
//        byte[] bytes1 = new byte[]{
//                0x7E,0x12,0x11,0x00,0x38,0x01,0x29,0x17,0x00,0x05,0x28,0x0E,0x4A,0x32,0x30,0x30,0x5F,0x36,0x35,0x5F,0x36,0x35,0x30,0x35,0x5F,0x30,0x30,0x5F,0x42,0x41,0xFC,0xF4,0x2E,0x73,0x4B,(byte)0x9C,(byte)0xBC,(byte)0xF1,0x24, (byte) 0xF5,(byte)0xDC,(byte)0x8D,0x2F,0x44,0x42,0x41,(byte)0xFC,(byte)0xF4,0x2E,0x73,0x4B,(byte)0x9C,(byte)0xBC,(byte)0xF1,0x24,(byte)0xF5,(byte)0xDC,(byte)0x8D,0x2F,0x44,0x2E,0x6A,0x70,0x67,0x00,0x00,0x00,0x3B,(byte)0xA4,(byte)0x96,0x7E};
//
//
//        Packet packet = Packet.create(bytes);
//        byte[] filenamelength = packet.seek(13).nextBytes(1);
//        byte[] fileName = packet.seek(14).nextBytes(filenamelength[0]);
//        try {
//
//
//            String str = new String(bytes, "GBK");
//            System.out.println(str);
////            Charset charset = Charset.defaultCharset();
////            ByteBuffer buf = ByteBuffer.wrap(fileName);
////            CharBuffer cBuf = charset.decode(buf);
////
////            System.out.println(cBuf.toString());
//
//
//            System.out.println(new String(bytes, 0));
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        byte fileType = packet.seek(14 + fileName.length).nextByte();
//        System.out.println(fileType);
//
//
//    }

    /**
     * 16?????????????????????????????????(??????Unicode??????)
     * @param hexStr
     * @return
     */


    public  static  String hexStr2Str(String hexStr) {
        String str =  "0123456789ABCDEF" ;
        char [] hexs = hexStr.toCharArray();
        byte [] bytes =  new  byte [hexStr.length() /  2 ];
        int  n;
        for  ( int  i =  0 ; i < bytes.length; i++) {
            n = str.indexOf(hexs[ 2  * i]) *  16 ;
            n += str.indexOf(hexs[ 2  * i +  1 ]);
            bytes[i] = ( byte ) (n &  0xff );
        }
        return  new  String(bytes);
    }



}
