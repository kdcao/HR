package model.queries;

import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Mar 26 16:36:09 CET 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GehaltBerufungRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        Salary,
        JobTitle;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index () {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex () {
            return firstIndex;
        }

        protected static int count () {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues () {
            if ( vals == null ) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int SALARY = AttributesEnum.Salary.index();
    public static final int JOBTITLE = AttributesEnum.JobTitle.index();

    /**
     * This is the default constructor (do not remove).
     */
    public GehaltBerufungRowImpl () {}
}

