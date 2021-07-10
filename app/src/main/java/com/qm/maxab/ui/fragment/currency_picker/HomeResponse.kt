package com.qm.maxab.ui.fragment.currency_picker

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


//MARK:- Home Response
@Parcelize
data class HomeResponse(
    val base: String?, // EUR
    val date: String?, // 2021-07-10
    val rates: Rates?,
    val success: Boolean?, // true
    val timestamp: Int?, // 1625893443
    val error: Error?,
) : Parcelable {

    @Parcelize
    data class Error(
        val code: Int?,
        val type: String?,
        val info: String?,
    ) : Parcelable

    @Parcelize
    data class Rates(
        val AED: Double? = null, // 4.362665
        val AFN: Double? = null, // 97.213724
        val ALL: Double? = null, // 122.812917
        val AMD: Double? = null, // 588.826504
        val ANG: Double? = null, // 2.131458
        val AOA: Double? = null, // 763.838418
        val ARS: Double? = null, // 113.976299
        val AUD: Double? = null, // 1.586162
        val AWG: Double? = null, // 2.138454
        val AZN: Double? = null, // 2.023805
        val BAM: Double? = null, // 1.958749
        val BBD: Double? = null, // 2.397553
        val BDT: Double? = null, // 100.642737
        val BGN: Double? = null, // 1.957753
        val BHD: Double? = null, // 0.4477
        val BIF: Double? = null, // 2359.959883
        val BMD: Double? = null, // 1.1877
        val BND: Double? = null, // 1.605812
        val BOB: Double? = null, // 8.19935
        val BRL: Double? = null, // 6.246594
        val BSD: Double? = null, // 1.18746
        val BTC: Double? = null, // 3.5382187e-5
        val BTN: Double? = null, // 88.536998
        val BWP: Double? = null, // 12.96361
        val BYN: Double? = null, // 3.053088
        val BYR: Double? = null, // 23278.919834
        val BZD: Double? = null, // 2.393547
        val CAD: Double? = null, // 1.478794
        val CDF: Double? = null, // 2379.561589
        val CHF: Double? = null, // 1.085345
        val CLF: Double? = null, // 0.032229
        val CLP: Double? = null, // 889.290839
        val CNY: Double? = null, // 7.694994
        val COP: Double? = null, // 4550.078667
        val CRC: Double? = null, // 737.312586
        val CUC: Double? = null, // 1.1877
        val CUP: Double? = null, // 31.47405
        val CVE: Double? = null, // 110.817037
        val CZK: Double? = null, // 25.743046
        val DJF: Double? = null, // 211.07851
        val DKK: Double? = null, // 7.437093
        val DOP: Double? = null, // 67.830013
        val DZD: Double? = null, // 159.908999
        val EGP: Double? = null, // 18.632
        val ERN: Double? = null, // 17.817874
        val ETB: Double? = null, // 52.057356
        val EUR: Int? = 0, // 1
        val FJD: Double? = null, // 2.452648
        val FKP: Double? = null, // 0.841893
        val GBP: Double? = null, // 0.85446
        val GEL: Double? = null, // 3.723487
        val GGP: Double? = null, // 0.841893
        val GHS: Double? = null, // 7.043525
        val GIP: Double? = null, // 0.841893
        val GMD: Double? = null, // 60.696046
        val GNF: Double? = null, // 11692.906839
        val GTQ: Double? = null, // 9.202737
        val GYD: Double? = null, // 248.438148
        val HKD: Double? = null, // 9.225287
        val HNL: Double? = null, // 28.493384
        val HRK: Double? = null, // 7.494848
        val HTG: Double? = null, // 112.486688
        val HUF: Double? = null, // 355.603363
        val IDR: Double? = null, // 17206.506702
        val ILS: Double? = null, // 3.89673
        val IMP: Double? = null, // 0.841893
        val INR: Double? = null, // 88.468507
        val IQD: Double? = null, // 1734.041988
        val IRR: Double? = null, // 50008.108561
        val ISK: Double? = null, // 146.301343
        val JEP: Double? = null, // 0.841893
        val JMD: Double? = null, // 180.617648
        val JOD: Double? = null, // 0.842126
        val JPY: Double? = null, // 130.759878
        val KES: Double? = null, // 128.157347
        val KGS: Double? = null, // 100.621473
        val KHR: Double? = null, // 4847.004082
        val KMF: Double? = null, // 493.044006
        val KPW: Double? = null, // 1068.930408
        val KRW: Double? = null, // 1360.285133
        val KWD: Double? = null, // 0.35751
        val KYD: Double? = null, // 0.989566
        val KZT: Double? = null, // 509.058634
        val LAK: Double? = null, // 11283.150334
        val LBP: Double? = null, // 1819.556801
        val LKR: Double? = null, // 236.539023
        val LRD: Double? = null, // 203.750387
        val LSL: Double? = null, // 16.948932
        val LTL: Double? = null, // 3.50697
        val LVL: Double? = null, // 0.718428
        val LYD: Double? = null, // 5.374389
        val MAD: Double? = null, // 10.585381
        val MDL: Double? = null, // 21.463658
        val MGA: Double? = null, // 4451.49998
        val MKD: Double? = null, // 61.70696
        val MMK: Double? = null, // 1954.525727
        val MNT: Double? = null, // 3380.192126
        val MOP: Double? = null, // 9.499978
        val MRO: Double? = null, // 424.008693
        val MUR: Double? = null, // 50.47
        val MVR: Double? = null, // 18.295023
        val MWK: Double? = null, // 953.133684
        val MXN: Double? = null, // 23.610467
        val MYR: Double? = null, // 4.977062
        val MZN: Double? = null, // 75.466906
        val NAD: Double? = null, // 16.948927
        val NGN: Double? = null, // 486.957405
        val NIO: Double? = null, // 41.777393
        val NOK: Double? = null, // 10.223917
        val NPR: Double? = null, // 141.657723
        val NZD: Double? = null, // 1.706808
        val OMR: Double? = null, // 0.45722
        val PAB: Double? = null, // 1.18746
        val PEN: Double? = null, // 4.706266
        val PGK: Double? = null, // 4.161354
        val PHP: Double? = null, // 59.363
        val PKR: Double? = null, // 189.323777
        val PLN: Double? = null, // 4.547589
        val PYG: Double? = null, // 8065.151333
        val QAR: Double? = null, // 4.324461
        val RON: Double? = null, // 4.928009
        val RSD: Double? = null, // 117.760495
        val RUB: Double? = null, // 88.384006
        val RWF: Double? = null, // 1184.730742
        val SAR: Double? = null, // 4.454837
        val SBD: Double? = null, // 9.54363
        val SCR: Double? = null, // 19.255234
        val SDG: Double? = null, // 534.465399
        val SEK: Double? = null, // 10.185601
        val SGD: Double? = null, // 1.604643
        val SHP: Double? = null, // 0.841893
        val SLL: Double? = null, // 12179.863815
        val SOS: Double? = null, // 694.804897
        val SRD: Double? = null, // 24.954175
        val STD: Double? = null, // 24239.170677
        val SVC: Double? = null, // 10.390397
        val SYP: Double? = null, // 1493.938572
        val SZL: Double? = null, // 16.948918
        val THB: Double? = null, // 38.728566
        val TJS: Double? = null, // 13.543083
        val TMT: Double? = null, // 4.168827
        val TND: Double? = null, // 3.295278
        val TOP: Double? = null, // 2.683787
        val TRY: Double? = null, // 10.286318
        val TTD: Double? = null, // 8.068657
        val TWD: Double? = null, // 33.214985
        val TZS: Double? = null, // 2754.276679
        val UAH: Double? = null, // 32.456379
        val UGX: Double? = null, // 4209.573393
        val USD: Double? = null, // 1.1877
        val UYU: Double? = null, // 52.289485
        val UZS: Double? = null, // 12625.251307
        val VEF: Double? = null, // 253966153256.85904
        val VND: Double? = null, // 27320.069055
        val VUV: Double? = null, // 128.795142
        val WST: Double? = null, // 2.995347
        val XAF: Double? = null, // 656.902776
        val XAG: Double? = null, // 0.045463
        val XAU: Double? = null, // 0.000657
        val XCD: Double? = null, // 3.209819
        val XDR: Double? = null, // 0.834001
        val XOF: Double? = null, // 659.771623
        val XPF: Double? = null, // 120.017517
        val YER: Double? = null, // 297.341125
        val ZAR: Double? = null, // 16.866367
        val ZMK: Double? = null, // 10690.729431
        val ZMW: Double? = null, // 26.913909
        val ZWL: Double? = null, // 382.439791
    ) : Parcelable
}

//MARK:- offlineResponse
fun offlineHomeResponse(): HomeResponse {
    return HomeResponse(base = "NAN",
        date = null,
        rates = HomeResponse.Rates(
            AED = 4.362665,
            EGP = 18.632,
            AMD = 588.826504,
            AWG = 2.138454,
            AZN = 2.023805,
            BAM = 1.958749,
            BBD = 2.397553,
            BDT = 100.642737,
        ),
        success = true,
        timestamp = null,
        error = null)
}

