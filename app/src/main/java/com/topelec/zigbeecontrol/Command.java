package com.topelec.zigbeecontrol;

/**
 * Created by Amber on 2015/3/19.
 */
public class Command {


    public static final int CHECK_SENSOR_DELAY = 1500;
    public static final String zigbeePort = "/dev/ttyAMA2";
    public static final String lfRfidPort = "/dev/ttyAMA2";
    public static final String hfRfidPort = "/dev/ttyAMA3";
    public static final String uhfRfidPort = "/dev/ttyAMA3";
    public static final int bautrate = 115200;
    public static final int lfBautrate = 9600;
    public static final int hfBautrate = 19200;
    public static final int uhfBautrate = 19200;
    //zigbee
    public static final byte LED_SENSOR = 0x0A;
    public static final byte FAN_SENSOR = (byte)0x0B;
    public static final byte TEMPHUM_SENSOR = (byte)0x0C;
    public static final byte BRIGHTNESS_SENSOR = 0x0D;
    public static final byte IR_SENSOR = 0x12;
    public static final byte PE_SENSOR = 0x0E;
    public static final byte HALL_SENSOR = 0x0F;
    public static final byte SMOKE_SENSOR = (byte)0x09;
    public static final byte STEPLESS_LED = 0x03;
    public static final byte AD_SENSOR = 0x11;
    public static final byte DOPPLER_SENSOR = 0x06;
    public static final byte SHAKE_SENSOR = 0x10;

    //lf
    public static final byte LF_PASSWORD = (byte)0x90;
    public static final byte LF_ID = (byte)0x91;

    //hf
    public static final byte HF_TYPE = (byte)0xA0;
    public static final byte HF_FREQ = (byte)0xA1;
    public static final byte HF_ACTIVE = (byte)0xA2;
    public static final byte HF_ID = (byte)0xA3;

    //uhf
    public static final byte UHF_ID = (byte)0xB0;
    public static final byte UHF_ONCE_FINISH =(byte)0xB1;

    public static final byte led1_on[] = { (byte)0xAA,0x05, 0x01, 0x0A, 0x01, 0x01, 0x12};
    public static final byte led1_off[] = {(byte)0xAA,0x05, 0x01, 0x0A, 0x01, 0x00, 0x11};

    public static final byte led2_on[] = {(byte)0xAA,0x05, 0x01, 0x0A, 0x02, 0x01, 0x13};
    public static final byte led2_off[] = {(byte)0xAA,0x05, 0x01, 0x0A, 0x02, 0x00, 0x12};

    public static final byte led3_on[] = {(byte)0xAA,0x05, 0x01, 0x0A, 0x03, 0x01, 0x14};
    public static final byte led3_off[] = {(byte)0xAA,0x05, 0x01, 0x0A, 0x03, 0x00, 0x13};

    public static final byte led4_on[] = {(byte)0xAA,0x05, 0x01, 0x0A, 0x04, 0x01, 0x15};
    public static final byte led4_off[] = {(byte)0xAA,0x05, 0x01, 0x0A, 0x04, 0x00, 0x14};

    public static final byte led_all_on[] = {(byte)0xAA,0x05, 0x01, 0x0A, 0x05, 0x01, 0x16};
    public static final byte led_all_off[] = {(byte)0xAA,0x05, 0x01, 0x0A, 0x05, 0x00, 0x15};

    public static final byte fan_forward[] = {(byte)0xAA,0x05, 0x01, 0x0B, 0x01, 0x01,0x13};
    public static final byte fan_backward[] = {(byte)0xAA,0x05, 0x01, 0x0B, 0x01, 0x02,0x14};
    public static final byte fan_stop[] = {(byte)0xAA,0x05, 0x01, 0x0B, 0x01, 0x00,0x12};

    public static final byte get_temp[] = {(byte)0xAA,0x05, 0x01, 0x0C, 0x01, 0x00,0x13};
    public static final byte get_hum[] = {(byte)0xAA,0x05, 0x01, 0x0C, 0x02, 0x00,0x14};

    public static final byte get_brightness[] = {(byte)0xAA,0x05, 0x01, 0x0D, 0x01, 0x00,0x14};

    public static final byte get_PE[] = {(byte)0xAA,0x05, 0x01, 0x0E, 0x01, 0x00,0x15};  //光电
    public static final byte get_IR[] = {(byte)0xAA,0x05, 0x01, 0x12, 0x01, 0x00,0x15};  //红外
    public static final byte get_hall[] = {(byte)0xAA,0x05, 0x01, 0x0F, 0x01, 0x00,0x16};
    public static final byte get_shake[] = {(byte)0xAA,0x05,0x01,0x10,0x01,0x00,0x17};

    public static final byte get_x[] = {(byte)0xAA,0x05,0x01,0x11,0x01,0x00,0x18};
    public static final byte get_y[] = {(byte)0xAA,0x05,0x01,0x11,0x02,0x00,0x19};
    public static final byte get_z[] = {(byte)0xAA,0x05,0x01,0x11,0x03,0x00,0x1A};

    public static final byte get_smoke[] = {(byte)0xAA,0x05, 0x01, 0x09, 0x01, 0x00,0x10};

    public static byte set_stepless_led[] = {(byte)0xAA,0x05, 0x01, 0x03, 0x01, 0x00,(byte)0xEC};


    public static final byte get_doppler[] = {(byte)0xAA,0x05,0x01,0x06,0x01,0x00,0x0D};

    public static final byte set_password_mode[] = {(byte)0xFF,(byte)0xFF,0x0D,0x00,0x01,0x06,0x00};
    public static final byte read_page_one[] = {(byte)0xFF,(byte)0xFF,0x01,0x03};
    public static final byte read_id_once[] = {(byte)0xBB,0x00,0x22,0x00,0x00,0x7E};
}