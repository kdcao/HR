package model.queries;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 25 14:37:39 CET 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GehaltJobsNationRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        LocationId,
        StreetAddress,
        PostalCode,
        City,
        StateProvince,
        CountryId,
        DepartmentId,
        DepartmentName,
        ManagerId,
        LocationId1,
        EmployeeId,
        FirstName,
        LastName,
        Email,
        PhoneNumber,
        HireDate,
        JobId,
        Salary,
        CommissionPct,
        ManagerId1,
        DepartmentId1,
        JobId1,
        JobTitle,
        MinSalary,
        MaxSalary,
        CountryId1,
        CountryName,
        RegionId,
        RegionId1,
        RegionName;
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


    public static final int LOCATIONID = AttributesEnum.LocationId.index();
    public static final int STREETADDRESS = AttributesEnum.StreetAddress.index();
    public static final int POSTALCODE = AttributesEnum.PostalCode.index();
    public static final int CITY = AttributesEnum.City.index();
    public static final int STATEPROVINCE = AttributesEnum.StateProvince.index();
    public static final int COUNTRYID = AttributesEnum.CountryId.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int DEPARTMENTNAME = AttributesEnum.DepartmentName.index();
    public static final int MANAGERID = AttributesEnum.ManagerId.index();
    public static final int LOCATIONID1 = AttributesEnum.LocationId1.index();
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int PHONENUMBER = AttributesEnum.PhoneNumber.index();
    public static final int HIREDATE = AttributesEnum.HireDate.index();
    public static final int JOBID = AttributesEnum.JobId.index();
    public static final int SALARY = AttributesEnum.Salary.index();
    public static final int COMMISSIONPCT = AttributesEnum.CommissionPct.index();
    public static final int MANAGERID1 = AttributesEnum.ManagerId1.index();
    public static final int DEPARTMENTID1 = AttributesEnum.DepartmentId1.index();
    public static final int JOBID1 = AttributesEnum.JobId1.index();
    public static final int JOBTITLE = AttributesEnum.JobTitle.index();
    public static final int MINSALARY = AttributesEnum.MinSalary.index();
    public static final int MAXSALARY = AttributesEnum.MaxSalary.index();
    public static final int COUNTRYID1 = AttributesEnum.CountryId1.index();
    public static final int COUNTRYNAME = AttributesEnum.CountryName.index();
    public static final int REGIONID = AttributesEnum.RegionId.index();
    public static final int REGIONID1 = AttributesEnum.RegionId1.index();
    public static final int REGIONNAME = AttributesEnum.RegionName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public GehaltJobsNationRowImpl () {}
}

