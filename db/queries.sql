select
    OCS.OCS_CSOPORT_NEV,
    DOL.DOL_CSALADI_NEV,
    DOL.DOL_KERESZTNEV,
    TAN.TAN_CSALADI_NEV,
    TAN.TAN_KERESZTNEV
from
    OVI_CSOPORT_TANULO_CST CST
        join OVI_CSOPORT_OCS OCS ON OCS.OCS_ID = CST.CST_CSOPORT_ID
        JOIN DOLGOZO_DOL DOL ON DOL.DOL_ID = OCS.OCS_VEZETO_DOL_ID
        JOIN TANULO_TAN TAN ON CST.CST_TANUO_ID = TAN.TAN_ID
ORDER BY OCS.OCS_CSOPORT_NEV;