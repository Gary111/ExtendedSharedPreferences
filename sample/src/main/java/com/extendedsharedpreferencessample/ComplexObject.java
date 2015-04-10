package com.extendedsharedpreferencessample;

import com.google.common.base.Objects;

import java.util.Arrays;
import java.util.List;

public class ComplexObject {

    private int intValue;
    private long longValue;
    private float floatValue;
    private double doubleValue;
    private boolean booleanValue;
    private String stringNull;
    private String stringValue;
    private Integer intClassNull;
    private Integer intClassValue;
    private Long longClassNull;
    private Long longClassValue;
    private Float floatClassNull;
    private Float floatClassValue;
    private Double doubleClassNull;
    private Double doubleClassValue;
    private Boolean booleanClassNull;
    private Boolean booleanClassValue;
    private int[] intArrayNull;
    private int[] intArrayValues;
    private long[] longArrayNull;
    private long[] longArrayValues;
    private float[] floatArrayNull;
    private float[] floatArrayValues;
    private double[] doubleArrayNull;
    private double[] doubleArrayValues;
    private boolean[] booleanArrayNull;
    private boolean[] booleanArrayValues;
    private String[] stringArrayNull;
    private String[] stringArrayValues;
    private Integer[] intClassArrayNull;
    private Integer[] intClassArrayValues;
    private Long[] longClassArrayNull;
    private Long[] longClassArrayValues;
    private Float[] floatClassArrayNull;
    private Float[] floatClassArrayValues;
    private Double[] doubleClassArrayNull;
    private Double[] doubleClassArrayValues;
    private Boolean[] booleanClassArrayNull;
    private Boolean[] booleanClassArrayValues;
    private List<String> stringListNull;
    private List<String> stringListValues;
    private List<Integer> intClassListNull;
    private List<Integer> intClassListValues;
    private List<Long> longClassListNull;
    private List<Long> longClassListValues;
    private List<Float> floatClassListNull;
    private List<Float> floatClassListValues;
    private List<Double> doubleClassListNull;
    private List<Double> doubleClassListValues;
    private List<Boolean> booleanClassListNull;
    private List<Boolean> booleanClassListValues;
    private ComplexSubObject complexSubObjectNull;
    private ComplexSubObject complexSubObjectValue;
    private ComplexSubObject[] complexSubObjectArrayNull;
    private ComplexSubObject[] complexSubObjectArrayValues;
    private List<ComplexSubObject> complexSubObjectListNull;
    private List<ComplexSubObject> complexSubObjectListValues;

    public ComplexObject fillSelf() {
        intValue = 354;
        longValue = 456612l;
        floatValue = 12123.145f;
        doubleValue = 56.415613;
        booleanValue = true;
        stringNull = null;
        stringValue = "value";
        intClassNull = null;
        intClassValue = 789;
        longClassNull = null;
        longClassValue = 156464l;
        floatClassNull = null;
        floatClassValue = 5460.16f;
        doubleClassNull = null;
        doubleClassValue = 465465.161331;
        booleanClassNull = null;
        booleanClassValue = true;
        intArrayNull = null;
        intArrayValues = new int[]{1, 5, 456};
        longArrayNull = null;
        longArrayValues = new long[]{56l, 54l, 46654l};
        floatArrayNull = null;
        floatArrayValues = new float[]{4646.4654f, 132.23f, 123.13f};
        doubleArrayNull = null;
        doubleArrayValues = new double[]{1313.46132, 13164.979, 2.79};
        booleanArrayNull = null;
        booleanArrayValues = new boolean[]{true, false, true};
        stringArrayNull = null;
        stringArrayValues = new String[]{"val", "v", "value"};
        intClassArrayNull = null;
        intClassArrayValues = new Integer[]{1, 5, null};
        longClassArrayNull = null;
        longClassArrayValues = new Long[]{56l, null, 46654l};
        floatClassArrayNull = null;
        floatClassArrayValues = new Float[]{null, 132.23f, 123.13f};
        doubleClassArrayNull = null;
        doubleClassArrayValues = new Double[]{1313.46132, 13164.979, null};
        booleanClassArrayNull = null;
        booleanClassArrayValues = new Boolean[]{true, false, null};
        stringListNull = null;
        stringListValues = Arrays.asList("val", "v", "value");
        intClassListNull = null;
        intClassListValues = Arrays.asList(1, 5, null);
        longClassListNull = null;
        longClassListValues = Arrays.asList(56l, null, 46654l);
        floatClassListNull = null;
        floatClassListValues = Arrays.asList(null, 132.23f, 123.13f);
        doubleClassListNull = null;
        doubleClassListValues = Arrays.asList(1313.46132, 13164.979, null);
        booleanClassListNull = null;
        booleanClassListValues = Arrays.asList(true, false, null);
        complexSubObjectNull = null;
        complexSubObjectValue = new ComplexSubObject().fillSelf();
        complexSubObjectArrayNull = null;
        complexSubObjectArrayValues = new ComplexSubObject[]{new ComplexSubObject().fillSelf(), null, new ComplexSubObject().fillSelf()};
        complexSubObjectListNull = null;
        complexSubObjectListValues = Arrays.asList(new ComplexSubObject().fillSelf(), null, new ComplexSubObject().fillSelf());

        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
                intValue,
                longValue,
                floatValue,
                doubleValue,
                booleanValue,
                stringNull,
                stringValue,
                intClassNull,
                intClassValue,
                longClassNull,
                longClassValue,
                floatClassNull,
                floatClassValue,
                doubleClassNull,
                doubleClassValue,
                booleanClassNull,
                booleanClassValue,
                intArrayNull,
                intArrayValues,
                longArrayNull,
                longArrayValues,
                floatArrayNull,
                floatArrayValues,
                doubleArrayNull,
                doubleArrayValues,
                booleanArrayNull,
                booleanArrayValues,
                stringArrayNull,
                stringArrayValues,
                intClassArrayNull,
                intClassArrayValues,
                longClassArrayNull,
                longClassArrayValues,
                floatClassArrayNull,
                floatClassArrayValues,
                doubleClassArrayNull,
                doubleClassArrayValues,
                booleanClassArrayNull,
                booleanClassArrayValues,
                stringListNull,
                stringListValues,
                intClassListNull,
                intClassListValues,
                longClassListNull,
                longClassListValues,
                floatClassListNull,
                floatClassListValues,
                doubleClassListNull,
                doubleClassListValues,
                booleanClassListNull,
                booleanClassListValues,
                complexSubObjectNull,
                complexSubObjectValue,
                complexSubObjectArrayNull,
                complexSubObjectArrayValues,
                complexSubObjectListNull,
                complexSubObjectListValues
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {
            return false;
        } else if (this == obj) {
            return true;
        } else {
            final ComplexObject other = (ComplexObject) obj;
            return Objects.equal(this.intValue, other.intValue)
                    && Objects.equal(this.longValue, other.longValue)
                    && Objects.equal(this.floatValue, other.floatValue)
                    && Objects.equal(this.doubleValue, other.doubleValue)
                    && Objects.equal(this.booleanValue, other.booleanValue)
                    && Objects.equal(this.stringNull, other.stringNull)
                    && Objects.equal(this.stringValue, other.stringValue)
                    && Objects.equal(this.intClassNull, other.intClassNull)
                    && Objects.equal(this.intClassValue, other.intClassValue)
                    && Objects.equal(this.longClassNull, other.longClassNull)
                    && Objects.equal(this.longClassValue, other.longClassValue)
                    && Objects.equal(this.floatClassNull, other.floatClassNull)
                    && Objects.equal(this.floatClassValue, other.floatClassValue)
                    && Objects.equal(this.doubleClassNull, other.doubleClassNull)
                    && Objects.equal(this.doubleClassValue, other.doubleClassValue)
                    && Objects.equal(this.booleanClassNull, other.booleanClassNull)
                    && Objects.equal(this.booleanClassValue, other.booleanClassValue)
                    && Arrays.equals(this.intArrayNull, other.intArrayNull)
                    && Arrays.equals(this.intArrayValues, other.intArrayValues)
                    && Arrays.equals(this.longArrayNull, other.longArrayNull)
                    && Arrays.equals(this.longArrayValues, other.longArrayValues)
                    && Arrays.equals(this.floatArrayNull, other.floatArrayNull)
                    && Arrays.equals(this.floatArrayValues, other.floatArrayValues)
                    && Arrays.equals(this.doubleArrayNull, other.doubleArrayNull)
                    && Arrays.equals(this.doubleArrayValues, other.doubleArrayValues)
                    && Arrays.equals(this.booleanArrayNull, other.booleanArrayNull)
                    && Arrays.equals(this.booleanArrayValues, other.booleanArrayValues)
                    && Arrays.equals(this.stringArrayNull, other.stringArrayNull)
                    && Arrays.equals(this.stringArrayValues, other.stringArrayValues)
                    && Arrays.equals(this.intClassArrayNull, other.intClassArrayNull)
                    && Arrays.equals(this.intClassArrayValues, other.intClassArrayValues)
                    && Arrays.equals(this.longClassArrayNull, other.longClassArrayNull)
                    && Arrays.equals(this.longClassArrayValues, other.longClassArrayValues)
                    && Arrays.equals(this.floatClassArrayNull, other.floatClassArrayNull)
                    && Arrays.equals(this.floatClassArrayValues, other.floatClassArrayValues)
                    && Arrays.equals(this.doubleClassArrayNull, other.doubleClassArrayNull)
                    && Arrays.equals(this.doubleClassArrayValues, other.doubleClassArrayValues)
                    && Arrays.equals(this.booleanClassArrayNull, other.booleanClassArrayNull)
                    && Arrays.equals(this.booleanClassArrayValues, other.booleanClassArrayValues)
                    && Objects.equal(this.stringListNull, other.stringListNull)
                    && Objects.equal(this.stringListValues, other.stringListValues)
                    && Objects.equal(this.intClassListNull, other.intClassListNull)
                    && Objects.equal(this.intClassListValues, other.intClassListValues)
                    && Objects.equal(this.longClassListNull, other.longClassListNull)
                    && Objects.equal(this.longClassListValues, other.longClassListValues)
                    && Objects.equal(this.floatClassListNull, other.floatClassListNull)
                    && Objects.equal(this.floatClassListValues, other.floatClassListValues)
                    && Objects.equal(this.doubleClassListNull, other.doubleClassListNull)
                    && Objects.equal(this.doubleClassListValues, other.doubleClassListValues)
                    && Objects.equal(this.booleanClassListNull, other.booleanClassListNull)
                    && Objects.equal(this.booleanClassListValues, other.booleanClassListValues)
                    && Objects.equal(this.complexSubObjectNull, other.complexSubObjectNull)
                    && Objects.equal(this.complexSubObjectValue, other.complexSubObjectValue)
                    && Arrays.equals(this.complexSubObjectArrayNull, other.complexSubObjectArrayNull)
                    && Arrays.equals(this.complexSubObjectArrayValues, other.complexSubObjectArrayValues)
                    && Objects.equal(this.complexSubObjectListNull, other.complexSubObjectListNull)
                    && Objects.equal(this.complexSubObjectListValues, other.complexSubObjectListValues);
        }
    }

    public static class ComplexSubObject {

        private int intValue;
        private long longValue;
        private float floatValue;
        private double doubleValue;
        private boolean booleanValue;
        private String stringNull;
        private String stringValue;
        private Integer intClassNull;
        private Integer intClassValue;
        private Long longClassNull;
        private Long longClassValue;
        private Float floatClassNull;
        private Float floatClassValue;
        private Double doubleClassNull;
        private Double doubleClassValue;
        private Boolean booleanClassNull;
        private Boolean booleanClassValue;
        private int[] intArrayNull;
        private int[] intArrayValues;
        private long[] longArrayNull;
        private long[] longArrayValues;
        private float[] floatArrayNull;
        private float[] floatArrayValues;
        private double[] doubleArrayNull;
        private double[] doubleArrayValues;
        private boolean[] booleanArrayNull;
        private boolean[] booleanArrayValues;
        private String[] stringArrayNull;
        private String[] stringArrayValues;
        private Integer[] intClassArrayNull;
        private Integer[] intClassArrayValues;
        private Long[] longClassArrayNull;
        private Long[] longClassArrayValues;
        private Float[] floatClassArrayNull;
        private Float[] floatClassArrayValues;
        private Double[] doubleClassArrayNull;
        private Double[] doubleClassArrayValues;
        private Boolean[] booleanClassArrayNull;
        private Boolean[] booleanClassArrayValues;
        private List<String> stringListNull;
        private List<String> stringListValues;
        private List<Integer> intClassListNull;
        private List<Integer> intClassListValues;
        private List<Long> longClassListNull;
        private List<Long> longClassListValues;
        private List<Float> floatClassListNull;
        private List<Float> floatClassListValues;
        private List<Double> doubleClassListNull;
        private List<Double> doubleClassListValues;
        private List<Boolean> booleanClassListNull;
        private List<Boolean> booleanClassListValues;

        public ComplexSubObject fillSelf() {
            intValue = 354;
            longValue = 456612l;
            floatValue = 12123.145f;
            doubleValue = 56.415613;
            booleanValue = true;
            stringNull = null;
            stringValue = "value";
            intClassNull = null;
            intClassValue = 789;
            longClassNull = null;
            longClassValue = 156464l;
            floatClassNull = null;
            floatClassValue = 5460.16f;
            doubleClassNull = null;
            doubleClassValue = 465465.161331;
            booleanClassNull = null;
            booleanClassValue = true;
            intArrayNull = null;
            intArrayValues = new int[]{1, 5, 456};
            longArrayNull = null;
            longArrayValues = new long[]{56l, 54l, 46654l};
            floatArrayNull = null;
            floatArrayValues = new float[]{4646.4654f, 132.23f, 123.13f};
            doubleArrayNull = null;
            doubleArrayValues = new double[]{1313.46132, 13164.979, 2.79};
            booleanArrayNull = null;
            booleanArrayValues = new boolean[]{true, false, true};
            stringArrayNull = null;
            stringArrayValues = new String[]{"val", "v", "value"};
            intClassArrayNull = null;
            intClassArrayValues = new Integer[]{1, 5, null};
            longClassArrayNull = null;
            longClassArrayValues = new Long[]{56l, null, 46654l};
            floatClassArrayNull = null;
            floatClassArrayValues = new Float[]{null, 132.23f, 123.13f};
            doubleClassArrayNull = null;
            doubleClassArrayValues = new Double[]{1313.46132, 13164.979, null};
            booleanClassArrayNull = null;
            booleanClassArrayValues = new Boolean[]{true, false, null};
            stringListNull = null;
            stringListValues = Arrays.asList("val", "v", "value");
            intClassListNull = null;
            intClassListValues = Arrays.asList(1, 5, null);
            longClassListNull = null;
            longClassListValues = Arrays.asList(56l, null, 46654l);
            floatClassListNull = null;
            floatClassListValues = Arrays.asList(null, 132.23f, 123.13f);
            doubleClassListNull = null;
            doubleClassListValues = Arrays.asList(1313.46132, 13164.979, null);
            booleanClassListNull = null;
            booleanClassListValues = Arrays.asList(true, false, null);

            return this;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(
                    intValue,
                    longValue,
                    floatValue,
                    doubleValue,
                    booleanValue,
                    stringNull,
                    stringValue,
                    intClassNull,
                    intClassValue,
                    longClassNull,
                    longClassValue,
                    floatClassNull,
                    floatClassValue,
                    doubleClassNull,
                    doubleClassValue,
                    booleanClassNull,
                    booleanClassValue,
                    intArrayNull,
                    intArrayValues,
                    longArrayNull,
                    longArrayValues,
                    floatArrayNull,
                    floatArrayValues,
                    doubleArrayNull,
                    doubleArrayValues,
                    booleanArrayNull,
                    booleanArrayValues,
                    stringArrayNull,
                    stringArrayValues,
                    intClassArrayNull,
                    intClassArrayValues,
                    longClassArrayNull,
                    longClassArrayValues,
                    floatClassArrayNull,
                    floatClassArrayValues,
                    doubleClassArrayNull,
                    doubleClassArrayValues,
                    booleanClassArrayNull,
                    booleanClassArrayValues,
                    stringListNull,
                    stringListValues,
                    intClassListNull,
                    intClassListValues,
                    longClassListNull,
                    longClassListValues,
                    floatClassListNull,
                    floatClassListValues,
                    doubleClassListNull,
                    doubleClassListValues,
                    booleanClassListNull,
                    booleanClassListValues
            );
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            } else if (getClass() != obj.getClass()) {
                return false;
            } else if (this == obj) {
                return true;
            } else {
                final ComplexSubObject other = (ComplexSubObject) obj;
                return Objects.equal(this.intValue, other.intValue)
                        && Objects.equal(this.longValue, other.longValue)
                        && Objects.equal(this.floatValue, other.floatValue)
                        && Objects.equal(this.doubleValue, other.doubleValue)
                        && Objects.equal(this.booleanValue, other.booleanValue)
                        && Objects.equal(this.stringNull, other.stringNull)
                        && Objects.equal(this.stringValue, other.stringValue)
                        && Objects.equal(this.intClassNull, other.intClassNull)
                        && Objects.equal(this.intClassValue, other.intClassValue)
                        && Objects.equal(this.longClassNull, other.longClassNull)
                        && Objects.equal(this.longClassValue, other.longClassValue)
                        && Objects.equal(this.floatClassNull, other.floatClassNull)
                        && Objects.equal(this.floatClassValue, other.floatClassValue)
                        && Objects.equal(this.doubleClassNull, other.doubleClassNull)
                        && Objects.equal(this.doubleClassValue, other.doubleClassValue)
                        && Objects.equal(this.booleanClassNull, other.booleanClassNull)
                        && Objects.equal(this.booleanClassValue, other.booleanClassValue)
                        && Arrays.equals(this.intArrayNull, other.intArrayNull)
                        && Arrays.equals(this.intArrayValues, other.intArrayValues)
                        && Arrays.equals(this.longArrayNull, other.longArrayNull)
                        && Arrays.equals(this.longArrayValues, other.longArrayValues)
                        && Arrays.equals(this.floatArrayNull, other.floatArrayNull)
                        && Arrays.equals(this.floatArrayValues, other.floatArrayValues)
                        && Arrays.equals(this.doubleArrayNull, other.doubleArrayNull)
                        && Arrays.equals(this.doubleArrayValues, other.doubleArrayValues)
                        && Arrays.equals(this.booleanArrayNull, other.booleanArrayNull)
                        && Arrays.equals(this.booleanArrayValues, other.booleanArrayValues)
                        && Arrays.equals(this.stringArrayNull, other.stringArrayNull)
                        && Arrays.equals(this.stringArrayValues, other.stringArrayValues)
                        && Arrays.equals(this.intClassArrayNull, other.intClassArrayNull)
                        && Arrays.equals(this.intClassArrayValues, other.intClassArrayValues)
                        && Arrays.equals(this.longClassArrayNull, other.longClassArrayNull)
                        && Arrays.equals(this.longClassArrayValues, other.longClassArrayValues)
                        && Arrays.equals(this.floatClassArrayNull, other.floatClassArrayNull)
                        && Arrays.equals(this.floatClassArrayValues, other.floatClassArrayValues)
                        && Arrays.equals(this.doubleClassArrayNull, other.doubleClassArrayNull)
                        && Arrays.equals(this.doubleClassArrayValues, other.doubleClassArrayValues)
                        && Arrays.equals(this.booleanClassArrayNull, other.booleanClassArrayNull)
                        && Arrays.equals(this.booleanClassArrayValues, other.booleanClassArrayValues)
                        && Objects.equal(this.stringListNull, other.stringListNull)
                        && Objects.equal(this.stringListValues, other.stringListValues)
                        && Objects.equal(this.intClassListNull, other.intClassListNull)
                        && Objects.equal(this.intClassListValues, other.intClassListValues)
                        && Objects.equal(this.longClassListNull, other.longClassListNull)
                        && Objects.equal(this.longClassListValues, other.longClassListValues)
                        && Objects.equal(this.floatClassListNull, other.floatClassListNull)
                        && Objects.equal(this.floatClassListValues, other.floatClassListValues)
                        && Objects.equal(this.doubleClassListNull, other.doubleClassListNull)
                        && Objects.equal(this.doubleClassListValues, other.doubleClassListValues)
                        && Objects.equal(this.booleanClassListNull, other.booleanClassListNull)
                        && Objects.equal(this.booleanClassListValues, other.booleanClassListValues);
            }
        }
    }
}
